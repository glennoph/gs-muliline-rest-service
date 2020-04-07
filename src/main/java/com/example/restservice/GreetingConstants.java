package com.example.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class GreetingConstants {

    @Value("${app.name.default2}")
    public static String dftNameConst2="dft2init";
}
