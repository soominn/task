package com.example.board.service;

import com.example.board.domain.dao.PhoneDAO;
import com.example.board.domain.vo.Criteria;
import com.example.board.domain.vo.PhoneVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {
    private final PhoneDAO phoneDAO;

    // 제품 등록
    public void register(PhoneVO phoneVO) {
        phoneDAO.register(phoneVO);
    }
    // 제품 1개 조회
    public PhoneVO read(Long phoneNumber) {
        return phoneDAO.read(phoneNumber);
    }
    // 제품 목록
    public List<PhoneVO> getList(Criteria criteria) {
        return phoneDAO.getList(criteria);
    }
    // 제품 수정
    public void modify(PhoneVO phoneVO) {
        phoneDAO.modify(phoneVO);
    };
}
