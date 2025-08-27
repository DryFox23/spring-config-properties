package com.bernadinusnaisau.spring.config.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties( prefix = "application")
public class ApplicationProperties {

    private String name;
    private Integer version;
    private boolean productionMode;
    private DatabaseProperties database;
    private List<Role> defaultRoles;
    private Map<String,Role> roles;
    private test test;

    private Duration defaultDuration;
    private Date expiredDate;

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

    @Getter
    @Setter
    public static class Role{
        private String id;
        private String name;
    }
}
