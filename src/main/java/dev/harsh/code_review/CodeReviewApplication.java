package dev.harsh.code_review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication

@EnableWebMvc
public class CodeReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeReviewApplication.class, args);
	}

}
