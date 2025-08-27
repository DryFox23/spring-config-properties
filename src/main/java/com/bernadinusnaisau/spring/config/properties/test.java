package com.bernadinusnaisau.spring.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
public class test {
    private String nameTest;
    private Integer versionTest;
}
