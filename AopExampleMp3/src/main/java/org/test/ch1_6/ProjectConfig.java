package org.test.ch1_6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.test.ch1_6.aspects.SecurityAspect;

@Configuration
@ComponentScan(basePackages = "org.test.ch1_6")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
}
