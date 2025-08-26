package com.bernadinusnaisau.spring.config.app.properties;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        ApplicationProperties.class
})
public class ApplicationPropertiesApp {

}
