package com.example.board.controller;

import com.example.board.domain.vo.Criteria;
import com.example.board.domain.vo.PhoneVO;
import com.example.board.service.PhoneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/phone/*")
@RequiredArgsConstructor
public class PhoneController {
    public final PhoneService phoneService;

    // 4개(DB 테이블 생성)
    // 1번 매개변수 1개 있고 리턴은 문자열
    @PostMapping("/register")
    public String register(@RequestBody PhoneVO phoneVO) {
        phoneService.register(phoneVO);
        return "등록 성공";
    }

    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/phone/register");
        return modelAndView;
    }

    // 2번 매개변수 없고 리턴은 JSON Object
    @GetMapping("/read")
    public PhoneVO read() {
        return phoneService.read(1L);
    }

    // 3번 매개변수 여러 개 있고 리턴은 JSON Object
    @PostMapping("/{phoneNumber}")
    public PhoneVO modify(@PathVariable Long phoneNumber, @RequestBody PhoneVO phoneVO) {
        log.info("고유 번호 : " + phoneNumber);
        phoneVO.setPhoneNumber(phoneNumber);
        phoneService.modify(phoneVO);
        return phoneService.read(phoneVO.getPhoneNumber());
    }

    // 4번 매개변수 여러 개 있고 리턴은 JSON Array
    @GetMapping("/list/{phoneNumber}/{pageNum}")
    public List<PhoneVO> getList(@PathVariable("pageNum") int pageNum, @PathVariable("phoneNumber") Long phoneNumber) {
        log.info("고유 번호 : " + phoneNumber);
        return phoneService.getList(new Criteria(pageNum, 5));
    }

    // Git 개인 레포지토리 push
}
