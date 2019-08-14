package com.az.etisalat.saas.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan("com.az")
@SpringBootApplication
public class EtisalatTestApiApplication {

    @Value("${etisalat.saas.service.username}")
    private String USERNAME;


    @Value("${etisalat.saas.service.password}")
    private String PASSWORD;

    public static void main(String[] args) {
        SpringApplication.run(EtisalatTestApiApplication.class, args);

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.basicAuthentication(USERNAME,PASSWORD).build();
    }

}
