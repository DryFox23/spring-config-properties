package com.bernadinusnaisau.spring.config.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
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
}
