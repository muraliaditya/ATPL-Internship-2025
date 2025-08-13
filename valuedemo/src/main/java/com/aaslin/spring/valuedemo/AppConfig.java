package com.aaslin.spring.valuedemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.aaslin.spring.valuedemo")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
