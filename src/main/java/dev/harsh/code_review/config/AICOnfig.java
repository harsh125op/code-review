package dev.harsh.code_review.config;


import com.google.genai.Client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AICOnfig {

    @Bean
    public Client genaiclient(@Value("${google_api_key}") String apiKey){
        if (apiKey == null) throw new IllegalArgumentException("API Key missing!");
        return new Client().builder().apiKey(apiKey).build();
    }


}
