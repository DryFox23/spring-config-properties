package com.bernadinusnaisau.spring.config.environment;

import com.bernadinusnaisau.spring.config.app.EnvironmentApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = EnvironmentApp.class)
public class EnvironmentTest {

    @Autowired
    private Environment environment;

    @Test
    void testGetEnv() {
        String JavaHome = environment.getProperty("JAVA_HOME");
        Assertions.assertEquals(JavaHome, "D:\\Program\\jdk21");
    }
}
