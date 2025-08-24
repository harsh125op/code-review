package dev.harsh.code_review.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReviewReq {

    private String code;

    public String getCode() {
        return code;
    }
}
