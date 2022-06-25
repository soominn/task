package com.example.board.domain.dao;

import com.example.board.domain.vo.PhoneVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PhoneDaoTests {
    @Autowired
    public PhoneDAO phoneDAO;

//    @Test
//    public void insertTest() {
//        log.info("-------------------------------");
//        log.info("insert-------------------------");
//        log.info("-------------------------------");
//        PhoneVO phoneVO = new PhoneVO();
//        phoneVO.setPhoneName("갤럭시 s22");
//        phoneVO.setPhonePrice(1100000L);
//        phoneVO.setPhoneBrand("SAMSUNG");
//        phoneDAO.register(phoneVO);
//    }

//    @Test
//    public void selectTest() {
//        log.info("-------------------------------");
//        log.info("select-------------------------");
//        log.info("-------------------------------");
//        phoneDAO.read(1L);
//    }

//    @Test
//    public void getListTest() {
//        log.info("-------------------------------");
//        log.info("getList------------------------");
//        log.info("-------------------------------");
//        phoneDAO.getList().stream().map(PhoneVO::toString).forEach(log::info);
//    }
}
