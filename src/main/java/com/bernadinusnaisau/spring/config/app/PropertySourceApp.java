package com.bernadinusnaisau.spring.config.app;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:/sample.properties")
})
public class PropertySourceApp {

    @Component
    @Getter
    public static class sampleProperties {

        @Value("${sample.name}")
        private String name;

        @Value("${sample.version}")
        private Integer version;
    }
}
