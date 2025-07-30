package com.smart.home.automation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.smart.home.automation")
public class AppConfig {
    // No @Bean methods needed here because we use @ComponentScan to auto-detect beans
}
