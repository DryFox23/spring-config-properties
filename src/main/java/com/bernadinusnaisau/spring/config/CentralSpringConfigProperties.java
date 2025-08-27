package com.bernadinusnaisau.spring.config;

import com.bernadinusnaisau.spring.config.properties.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        ApplicationProperties.class
})
public class CentralSpringConfigProperties {
    public static void main(String[] args) {
        SpringApplication.run(CentralSpringConfigProperties.class, args);
    }
}
