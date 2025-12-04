package com.rest.RestServices;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
basePackages = "com.example.proxy")
public class ProjectConfig {
}
