package com.bernadinusnaisau.spring.config.app.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties("application")
public class ApplicationProperties {

    private String name;
    private Integer version;
    private boolean productionMode;
    private DatabaseProperties database;

    @Getter
    @Setter
    public static class DatabaseProperties {
        private String username;
        private String password;
        private String url;
        private String driver;
        private List<String> whitelisttables;
        private Map<String,Integer> maxTableSize;
    }
}
