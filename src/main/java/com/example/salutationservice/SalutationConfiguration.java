package com.example.salutationservice;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SalutationProperties.class)
public class SalutationConfiguration {

    @Bean
    public SalutationService getSalutationService(SalutationProperties salutationProperties) {
        return  new SalutationServiceImplementation(salutationProperties);
    }
}
