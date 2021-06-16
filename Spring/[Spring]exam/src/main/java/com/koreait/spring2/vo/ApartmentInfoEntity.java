package com.koreait.spring2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApartmentInfoEntity
{
    private int sec_i;
    @JsonProperty("거래금액")
    private String sec_amount;
    @JsonProperty("건축년도")
    private String build_year;
    @JsonProperty("년")
    private String sec_year;
    @JsonProperty("월")
    private String sec_monut;
    @JsonProperty("일")
    private String sec_day;
    @JsonProperty("법정동")
    private String dong;
    @JsonProperty("아파트")
    private String apratment_name;
    @JsonProperty("전용면적")
    private float area_for_ex_use;
    @JsonProperty("지번")
    private String jibun;
    @JsonProperty("층")
    private int flr;

    private int location_cd;

    public void setDeal_amount(String str)
    {
        this.sec_amount = str.trim().replace(",","");
    }
}
