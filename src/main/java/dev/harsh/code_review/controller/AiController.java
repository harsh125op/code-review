package dev.harsh.code_review.controller;

import dev.harsh.code_review.dto.ReviewReq;
import dev.harsh.code_review.dto.ReviewRes;
import dev.harsh.code_review.service.AiService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ai")
public class AiController {
    private final AiService aiservice;

    public AiController(AiService aiservice){
        this.aiservice =aiservice;
    }
    @PostMapping("/get-review")
    public ResponseEntity<ReviewRes> getReview(@RequestBody ReviewReq request) {
        String review = aiservice.review(request);
        return ResponseEntity.ok(new ReviewRes(review));
    }
}


