package io.aiven.klaw.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/notFound").setViewName("forward:/index.html");
  }

  @Override

  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
        .addResourceHandler("/static/assets/images/**")
        .addResourceLocations("classpath:/static/assets/images/")
        .setCachePeriod(604800); // 1 week in seconds
  }
}
