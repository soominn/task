package com.example.board.controller;

import com.example.board.domain.vo.TestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/test/*")
@RequiredArgsConstructor
public class TestController {
    // 5개
    // 1번 매개변수 없고 리턴은 문자열
    @GetMapping("/testString")
    public String test1() {
        return "김수한무 거북이와 두루미";
    }

    // 2번 매개변수 1개 있고 리턴은 문자열
    @GetMapping("/testString/{number}")
    public String test2(@PathVariable("number") int number) {
        return number + "번째 김수한무 거북이와 두루미";
    }

    // 3번 매개변수 없고 리턴은 JSON Object
    @GetMapping("/testJSON")
    public TestDTO test3() {
        TestDTO testDTO = new TestDTO();
        testDTO.setName("김수한");
        testDTO.setNickname("김수한무");
        testDTO.setAge(20L);
        return testDTO;
    }

    // 4번 매개변수 여러 개 있고 리턴은 JSON Object
    @PostMapping("/testJSON")
    public TestDTO test4(@RequestBody TestDTO testDTO) {
        return testDTO;
    }

    // 5번 매개변수 여러 개 있고 리턴은 JSON Array
    @PostMapping("/testJSONArr")
    public List<TestDTO> test5(@RequestBody List<TestDTO> testDTO) {
        return testDTO;
    }

    // 나머지는 PhoneController에서 진행ㄴ
}
