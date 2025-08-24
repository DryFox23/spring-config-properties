package com.bernadinusnaisau.spring.config.appproperties;

import com.bernadinusnaisau.spring.config.app.ApplicationPropertiesApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = ApplicationPropertiesApp.class)
public class ApplicationPropertiesTest {


    @Autowired
    private Environment environment;

    @Test
    void testApplicationProperties() {
        String message = environment.getProperty("application.name");
        Assertions.assertEquals("Spring Boot", message);
    }
}
