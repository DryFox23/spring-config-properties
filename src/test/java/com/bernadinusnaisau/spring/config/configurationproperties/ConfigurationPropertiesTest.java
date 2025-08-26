package com.bernadinusnaisau.spring.config.configurationproperties;

import com.bernadinusnaisau.spring.config.app.properties.ApplicationProperties;
import com.bernadinusnaisau.spring.config.app.properties.ApplicationPropertiesApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

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

    @Test
    void testApplicationPropertiesDatabase() {
        Assertions.assertEquals("bernad", applicationProperties.getDatabase().getUsername());
        Assertions.assertEquals("rahasia", applicationProperties.getDatabase().getPassword());
        Assertions.assertEquals("mysql", applicationProperties.getDatabase().getDriver());
        Assertions.assertEquals("jdbc:contoh", applicationProperties.getDatabase().getUrl());
    }

    @Test
    void testListandMapConfigurationProperties() {
        Assertions.assertEquals(Arrays.asList("products", "customers", "categories"), applicationProperties.getDatabase().getWhitelisttables());
        Assertions.assertEquals(100, applicationProperties.getDatabase().getMaxTableSize().get("products"));
        Assertions.assertEquals(100, applicationProperties.getDatabase().getMaxTableSize().get("customers"));
        Assertions.assertEquals(100, applicationProperties.getDatabase().getMaxTableSize().get("categories"));
    }

    @Test
    void testEmbededBeanObjectListandMapConfigurationProperties() {
        Assertions.assertEquals("default", applicationProperties.getDefaultRoles().get(0).getId());
        Assertions.assertEquals("default role", applicationProperties.getDefaultRoles().get(0).getName());
        Assertions.assertEquals("guest", applicationProperties.getDefaultRoles().get(1).getId());
        Assertions.assertEquals("guest role", applicationProperties.getDefaultRoles().get(1).getName());

        Assertions.assertEquals("admin",applicationProperties.getRoles().get("admin").getId());
        Assertions.assertEquals("admin role", applicationProperties.getRoles().get("admin role").getId());
        Assertions.assertEquals("guest",applicationProperties.getRoles().get("guest").getId());
        Assertions.assertEquals("guest role", applicationProperties.getRoles().get("guest role").getName());

        Assertions.assertEquals("admin", applicationProperties.getRoles().get("admin").getId());
        Assertions.assertEquals("admin role", applicationProperties.getRoles().get("admin").getName());
        Assertions.assertEquals("guest", applicationProperties.getRoles().get("guest").getId());
        Assertions.assertEquals("guest role", applicationProperties.getRoles().get("guest").getName());

    }
}
