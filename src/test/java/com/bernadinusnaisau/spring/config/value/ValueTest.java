package com.bernadinusnaisau.spring.config.value;

import com.bernadinusnaisau.spring.config.app.ValueApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ValueApp.class)
public class ValueTest {

    @Autowired
    private ValueApp.applicationProperties applicationProperties;

    @Test
    void testValueProperties() {
        Assertions.assertEquals("Spring Boot", applicationProperties.getName());
        Assertions.assertEquals(1, applicationProperties.getVersion());
        Assertions.assertEquals(false, applicationProperties.getProductionMode());
        Assertions.assertNotNull(applicationProperties.getJavaHome());
    }
}
