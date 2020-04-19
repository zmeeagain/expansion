package com.expansion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExpansionApplication {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplication(ExpansionApplication.class).run(args);
    context
        .getBean(MyProperties.class)
        .printProperties();
  }

  @Bean
  MyProperties myBean() {
    return new MyProperties();
  }
}
