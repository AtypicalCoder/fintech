package com.hundsun.fintech.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/login", method = {RequestMethod.POST})
    public String login(){

        return "redirect:/index.html";
    }
}
