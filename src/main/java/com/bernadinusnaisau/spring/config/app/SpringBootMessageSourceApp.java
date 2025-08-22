package com.bernadinusnaisau.spring.config.app;

import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@SpringBootApplication
public class SpringBootMessageSourceApp {

    @Component
    public static class SampleMessageSource implements MessageSourceAware{

        @Setter
        private MessageSource messageSource;

        public String getMessage(Locale locale){
            return messageSource.getMessage("hello", new Object[]{"bernad"}, locale);
        }
    }
}
