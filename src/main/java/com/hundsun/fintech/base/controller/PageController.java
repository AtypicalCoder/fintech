package com.hundsun.fintech.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping(value = "/")
    public String indexPage(){
        return "redirect:/pages/examples/login.html";
    }

}