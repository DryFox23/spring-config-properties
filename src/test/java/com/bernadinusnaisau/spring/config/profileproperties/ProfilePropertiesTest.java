package com.bernadinusnaisau.spring.config.profileproperties;

import com.bernadinusnaisau.spring.config.app.ProfilePropertiesApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ProfilePropertiesApp.class)
@ActiveProfiles({"production", "test"})
public class ProfilePropertiesTest {
    
    @Autowired
    private ProfilePropertiesApp.GetProfileProperties profileProperties;

    @Test
    void testProfileProperties() {
        Assertions.assertEquals("default", profileProperties.getDefaultProfile());
        Assertions.assertEquals("production", profileProperties.getProductionProfile());
        Assertions.assertEquals("test", profileProperties.getTestProfile());
    }
}
