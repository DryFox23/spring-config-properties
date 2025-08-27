package com.bernadinusnaisau.spring.config.app;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProfilePropertiesApp {

    @Getter
    @Component
    @Profile("production")
    public static class GetProfileProperties {

        @Value("${profile.default}")
        private String defaultProfile;

        @Value("${profile.production}")
        private String productionProfile;

        @Value("${profiles.test}")
        private String testProfile;
    }
}
