//package com.example.practicingapi.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpEntity;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.http.HttpHeaders;
//
//import java.util.Collections;
//
//
//@Configuration
//public class RestTemplateConfiguration {
//
//    @Bean
//    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate();
//
//        restTemplate.setInterceptors(Collections.singletonList(new JsonInterceptor()));
//        return restTemplate;
//    }
//}
