package com.bernadinusnaisau.spring.config.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class ResourceLoaderApp {

    @Component
    public static class SampleResourceLoader implements ResourceLoaderAware{

        private ResourceLoader resourceLoader;

        @Override
        public void setResourceLoader(ResourceLoader resourceLoader) {
            this.resourceLoader = resourceLoader;
        }

        public String getText() throws IOException {
            Resource resource = resourceLoader.getResource("classpath:/text/Resource.txt");
            try (InputStream inputStream = resource.getInputStream()) {
                return new String(inputStream.readAllBytes());
            }
        }
    }
}
