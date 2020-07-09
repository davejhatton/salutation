package com.example.salutationservice;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("salutation.values")
@NoArgsConstructor
@Getter
@Setter
public class SalutationProperties {

    private String mr;
    private String mrs;
    private String miss;
    private String dr;
    private String sir;
}
