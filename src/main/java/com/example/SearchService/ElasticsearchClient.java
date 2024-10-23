package com.example.SearchService;


import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ElasticsearchClient {

    private static final String TEST_URL = "";

    private final WebClient webClient;

    public Mono<String> search() {
        return webClient.get()
                .uri(TEST_URL)
                .retrieve()
                .bodyToMono(String.class);
    }
}
