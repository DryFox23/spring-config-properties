package com.bernadinusnaisau.spring.config.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ApplicationPropertiesApp {

    @Autowired
    private Environment environment;
}
