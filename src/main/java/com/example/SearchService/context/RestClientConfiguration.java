package com.example.SearchService.context;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@RequiredArgsConstructor
public class RestClientConfiguration {

    @Value("${elasticsearch.auth.user}")
    private String esUser;

    @Value("${elasticsearch.auth.password}")
    private String esPassword;

    @Bean
    public WebClient webClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .clone()
                .filter(ExchangeFilterFunctions.basicAuthentication(esUser, esUser))
                .build();
    }
}
