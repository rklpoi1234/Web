package com.koreait.spring2;

import com.koreait.spring2.vo.ApartmentInfoEntity;
import com.koreait.spring2.vo.InsertEntity;
import com.koreait.spring2.vo.LocationCodeEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KoreaMapper {
    int insApartmentInfoArr(InsertEntity param);
    List<LocationCodeEntity> selLocationCodeList(SearchDTO dto);
    List<ApartmentInfoEntity> selApartmentIfList(SearchDTO dto);
}
