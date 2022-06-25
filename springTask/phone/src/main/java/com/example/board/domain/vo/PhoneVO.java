package com.example.board.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PhoneVO {
    private Long phoneNumber;
    private String phoneName;
    private Long phonePrice;
    private String phoneBrand;
}
