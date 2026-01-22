package io.aiven.klaw;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "${klaw.shedlock.defaultLockAtMostFor:PT30S}")
@SpringBootApplication(
    exclude = {
      DataSourceAutoConfiguration.class,
      DataSourceTransactionManagerAutoConfiguration.class,
      HibernateJpaAutoConfiguration.class
    })
public class UiapiApplication {

  public static void main(String[] args) {
    SpringApplication.run(UiapiApplication.class, args);
  }
}
