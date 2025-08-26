package com.bernadinusnaisau.spring.config.profile;

import com.bernadinusnaisau.spring.config.app.ProfileApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ProfileApp.class)
@ActiveProfiles({"local"})
public class ProfileTest {

    @Autowired
    private ProfileApp.sayHello sayHello;

    @Test
    void testProfileLocal() {
        Assertions.assertEquals("hello bernad from production", sayHello.say("bernad"));
    }
}
