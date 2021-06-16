package com.koreait.spring2;

import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KoreaController {

    @Autowired
    private KoreaService service;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("List",service.selLocationCodeList());
        return "hello";
    }

    @GetMapping("/result")
    public String result()

    {
        return "";
    }
    @PostMapping("result")
    public String result(SearchDTO dto)
    {
        System.out.println("dto"+ dto);
        System.out.println("dto"+ dto.getDeal_month());
        System.out.println("dto"+ dto.getDeal_year());
        System.out.println("dto"+ dto.getExternalAreaCd());
        service.saveData(dto);
        return "redirect:/result";
    }

}
