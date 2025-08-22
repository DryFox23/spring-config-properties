package com.bernadinusnaisau.spring.config.resourceloader;

import com.bernadinusnaisau.spring.config.app.ResourceLoaderApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest(classes = ResourceLoaderApp.class)
public class LoaderTest {

    @Autowired
    private ResourceLoaderApp.SampleResourceLoader resourceLoader;

    @Test
    void testGetText() throws IOException {
        Assertions.assertEquals("Hello World", resourceLoader.getText().trim());
    }
}
