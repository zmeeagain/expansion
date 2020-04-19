package com.expansion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "property")
class MyProperties {
  private static final Logger logger = LoggerFactory.getLogger(MyProperties.class);

  private String present;
  private String absent;

  public void setPresent(String present) {
    this.present = present;
  }

  public void setAbsent(String absent) {
    this.absent = absent;
  }

  public void printProperties() {
    logger.info("Present: {}", present);
    logger.info("Absent: {}", absent);
  }
}
