package com.example.learnspringboot.aprendiendoSpring.configurations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
currency-service.url=
currency-service.username=
currency-service.key=*/


//Component establishes that a class will be Spring-managed,
// becoming a candidate for component scanning.
// Allowing Spring to automatically detect it and register it
// as a bean which allows us to autowire it
@Setter
@Getter
@ConfigurationProperties(prefix = "currency-service")
@Component
public class ServicioMonedaConfiguracion {
    private String url;
    private String username;
    private String key;
}
