package io.aiven.klaw.config;

import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.tomcat.servlet.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component

public class Http2Config implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

  private static final int COMPRESSION_MIN_SIZE_BYTES = 1024;
  private static final String COMPRESSIBLE_MIME_TYPES =
      "text/html,text/css,application/javascript";

  @Override
  public void customize(TomcatServletWebServerFactory factory) {
    factory.addConnectorCustomizers(
        (connector) -> {
          connector.addUpgradeProtocol(new Http2Protocol());
          ProtocolHandler handler = connector.getProtocolHandler();
          if (handler instanceof AbstractHttp11Protocol) {
            AbstractHttp11Protocol<?> protocol = (AbstractHttp11Protocol<?>) handler;
            protocol.setCompression("on");
            protocol.setCompressionMinSize(COMPRESSION_MIN_SIZE_BYTES);
            String mimeTypesWithJson =
                COMPRESSIBLE_MIME_TYPES + "," + MediaType.APPLICATION_JSON_VALUE;
            protocol.setCompressibleMimeType(mimeTypesWithJson);
          }
        });
  }
}

