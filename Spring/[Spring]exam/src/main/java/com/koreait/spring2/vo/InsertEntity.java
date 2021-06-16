package com.koreait.spring2.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class InsertEntity {
    private int location_cd;
    private ApartmentInfoEntity[] arr;
}
