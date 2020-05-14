package com.allen.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: allen
 * @Date: 2020-04-16 19:22
 * @Description:
 */
@Controller
public class BaseController {

    @GetMapping("/autojump")
    public String base(){
        return "autojump";
    }
}
