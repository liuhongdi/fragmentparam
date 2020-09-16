package com.fragmentparam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
@Controller
public class HomeController {

    @GetMapping("/home")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("curTitle","首页");
        modelMap.addAttribute("jsversion","20200915121212");
        return "home/home";
    }
}
