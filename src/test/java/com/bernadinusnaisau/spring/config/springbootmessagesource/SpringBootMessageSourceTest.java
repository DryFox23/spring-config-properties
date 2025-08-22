package com.bernadinusnaisau.spring.config.springbootmessagesource;

import com.bernadinusnaisau.spring.config.app.SpringBootMessageSourceApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest(classes = SpringBootMessageSourceApp.class)
public class SpringBootMessageSourceTest {
    
    @Autowired
    SpringBootMessageSourceApp.SampleMessageSource sampleMessageSource;

    @Test
    void testI18N() {
        Assertions.assertEquals("hello bernad", sampleMessageSource.getMessage(Locale.UK));
        Assertions.assertEquals("hello bernad", sampleMessageSource.getMessage(new Locale("id_ID")));
    }
}
