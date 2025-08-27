package com.bernadinusnaisau.spring.config.app.properties;

import com.bernadinusnaisau.spring.config.app.converter.StringToDateConverter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.core.convert.ConversionService;

@SpringBootApplication
@EnableConfigurationProperties({
        ApplicationProperties.class
})
@Import(StringToDateConverter.class)
public class ApplicationPropertiesApp {

    @Bean
    public ConversionService conversionService(StringToDateConverter stringToDateConverter) {
        ApplicationConversionService conversionService = new ApplicationConversionService();
        conversionService.addConverter(new StringToDateConverter());
        return conversionService;
    }

}
