package com.db.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authror qzy
 * @Date 2019/7/17 10:59
 */
@RestController
public class test {
    @RequestMapping("test")
    public String test(){
        return "访问成功";
    }
}
