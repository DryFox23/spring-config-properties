package com.bernadinusnaisau.spring.config.propertysource;

import com.bernadinusnaisau.spring.config.app.PropertySourceApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PropertySourceApp.class)
public class PropertySourceTest {

    @Autowired
    private PropertySourceApp.sampleProperties sampleProperties;

    @Test
    void testGetProperty() {
        Assertions.assertEquals("project sample", sampleProperties.getName());
        Assertions.assertEquals(1, sampleProperties.getVersion());
    }
}
