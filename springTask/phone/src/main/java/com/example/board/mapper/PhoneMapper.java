package com.example.board.mapper;

import com.example.board.domain.vo.Criteria;
import com.example.board.domain.vo.PhoneVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhoneMapper {
    // 제품 등록
    public void insert(PhoneVO phoneVO);
    // 제품 1개 조회
    public PhoneVO select(Long phoneNumber);
    // 제품 목록
    public List<PhoneVO> getList(Criteria criteria);
    // 제품 수정
    public void update(PhoneVO phoneVO);
}
