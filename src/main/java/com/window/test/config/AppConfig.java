package com.window.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.window.test")
@PropertySource("classpath:app.properties")
public class AppConfig {
	// various @Bean definitions ...
}