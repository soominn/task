package com.example.board.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestDTO {
    private String name;
    private String nickname;
    private Long age;
}
