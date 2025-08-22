package com.bernadinusnaisau.spring.config.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class MessageSourceApp {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("my");
        return messageSource;
    }
}
