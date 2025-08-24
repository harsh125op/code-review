package dev.harsh.code_review.config;

import com.google.genai.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AICOnfig {

    @Bean
    public Client genaiclient(){
        return new Client();
    }


}
