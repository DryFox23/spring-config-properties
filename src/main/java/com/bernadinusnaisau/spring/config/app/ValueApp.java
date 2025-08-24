package com.bernadinusnaisau.spring.config.app;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ValueApp {

    @Component
    @Getter
    public static class applicationProperties {

        @Value("${application.name}")
        private String name;

        @Value("${application.version}")
        private Integer version;

        @Value("${application.production.mode}")
        private Boolean productionMode;

        @Value("${JAVA_HOME}")
        private String JavaHome;

    }
}
