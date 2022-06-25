package com.example.board.domain.dao;

import com.example.board.domain.vo.Criteria;
import com.example.board.domain.vo.PhoneVO;
import com.example.board.mapper.PhoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PhoneDAO {
    private final PhoneMapper phoneMapper;

    // 제품 등록
    public void register(PhoneVO phoneVO) {
        phoneMapper.insert(phoneVO);
    }
    // 제품 1개 조회
    public PhoneVO read(Long phoneNumber) {
        return phoneMapper.select(phoneNumber);
    }
    // 제품 목록
    public List<PhoneVO> getList(Criteria criteria) {
        return phoneMapper.getList(criteria);
    }
    // 제품 수정
    public void modify(PhoneVO phoneVO) {
        phoneMapper.update(phoneVO);
    };
}
