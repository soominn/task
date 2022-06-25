package com.example.board.mapper;

import com.example.board.domain.vo.PhoneVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PhoneMapperTests {
    @Autowired
    private PhoneMapper phoneMapper;

    @Test
    public void insertTest() {
        log.info("-------------------------------");
        log.info("insert-------------------------");
        log.info("-------------------------------");
        PhoneVO phoneVO = new PhoneVO();
        phoneVO.setPhoneName("아이폰 12 미니");
        phoneVO.setPhonePrice(1000000L);
        phoneVO.setPhoneBrand("Apple");
        phoneMapper.insert(phoneVO);
    }

//    @Test
//    public void selectTest() {
//        log.info("-------------------------------");
//        log.info("select-------------------------");
//        log.info("-------------------------------");
//        phoneMapper.select(1L);
//    }

//    @Test
//    public void getListTest() {
//        log.info("-------------------------------");
//        log.info("getList------------------------");
//        log.info("-------------------------------");
//        phoneMapper.getList().stream().map(PhoneVO::toString).forEach(log::info);
//    }

//    @Test
//    public void updateTest() {
//        log.info("-------------------------------");
//        log.info("update------------------------");
//        log.info("-------------------------------");
//        PhoneVO phoneVO = phoneMapper.select(1L);
//        phoneVO.setPhoneName("아이폰 12");
//        phoneVO.getPhoneBrand();
//        phoneVO.getPhonePrice();
//    }
}
