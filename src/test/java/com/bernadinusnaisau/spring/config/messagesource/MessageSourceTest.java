package com.bernadinusnaisau.spring.config.messagesource;

import com.bernadinusnaisau.spring.config.app.MessageSourceApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

@SpringBootTest(classes = MessageSourceApp.class)
public class MessageSourceTest {

    @Autowired
    private MessageSource messageSource;



    @Test
    void testLocaleEng() {
        String message = messageSource.getMessage("hello", new Object[]{"Bernad"}, Locale.UK);
        Assertions.assertEquals("hello Bernad", message);
    }

    @Test
    void testLocaleID() {
        String message = messageSource.getMessage("hello", new Object[]{"Bernad"}, new Locale("in", "ID"));
        Assertions.assertEquals("hello Bernad", message);
    }
}

