package com.frode.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


//
 //这里不是RestController

//@RestController//直接显示index3
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("hello2", "hello2 Thymeleaf!");
        map.addAttribute("hello", "hello Thymeleaf!");
        return "index3";
    }
}