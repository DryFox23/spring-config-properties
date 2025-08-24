package com.bernadinusnaisau.spring.config.testpropertysource;
import lombok.Getter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;

@TestPropertySources({
        @TestPropertySource("classpath:/test.properties")
})
@SpringBootTest(classes = PropertySourceTest.TestPropertySource.class)
public class PropertySourceTest {

    @Autowired
    private TestPropertySource.TestSampleProperties properties;

    @Test
    void testGetSampleProperties() {
        Assertions.assertEquals("sample project test", properties.getName());
        Assertions.assertEquals(1, properties.getVersion());
    }

    @SpringBootApplication
    public static class TestPropertySource{

        @Component
        @Getter
        public static class TestSampleProperties{

            @Value("${test.name}")
            private String name;

            @Value("${test.version}")
            private Integer version;
        }
    }
}
