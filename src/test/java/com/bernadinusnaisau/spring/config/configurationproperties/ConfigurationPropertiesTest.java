package com.bernadinusnaisau.spring.config.configurationproperties;

import com.bernadinusnaisau.spring.config.app.properties.ApplicationProperties;
import com.bernadinusnaisau.spring.config.app.properties.ApplicationPropertiesApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ApplicationPropertiesApp.class)
public class ConfigurationPropertiesTest {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Test
    void testApplicationProperties() {
        Assertions.assertEquals("Spring Boot", applicationProperties.getName());
        Assertions.assertEquals(1, applicationProperties.getVersion());
        Assertions.assertFalse(applicationProperties.isProductionMode());
    }
}
