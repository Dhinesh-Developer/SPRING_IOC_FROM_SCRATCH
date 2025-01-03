package com.JavaConfiguration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Alternate for beans.xml file.

@Configuration
@ComponentScan(basePackages = "com.JavaConfiguration")
public class appConfig {


}
