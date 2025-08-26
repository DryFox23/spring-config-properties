package com.bernadinusnaisau.spring.config.app;

import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProfileApp {

    public interface sayHello {
        String say(String name);
    }

    @Component
    @Profile(value = "local")
    public static class SayHelloLocal implements sayHello {

        @Override
        public String say(String name) {
            return "hello " + name + " from local";
        }
    }

    @Component
    @Profile(value = "production")
    public static class SayHelloProduction implements sayHello {
        @Override
        public String say(String name) {
            return "hello " + name + " from production";
        }
    }

    @Component
    public static class envProfile implements EnvironmentAware {

        @Setter
        private Environment environment;

        public String[] getActiveProfiles() {
            return environment.getActiveProfiles();
        }
    }
}
