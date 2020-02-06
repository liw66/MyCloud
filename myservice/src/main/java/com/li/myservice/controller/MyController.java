package com.li.myservice.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @program: mycloud
 * @description:
 * @author: Liwei
 * @create: 2020-01-13 11:43
 **/
@RestController
public class MyController {

    @GetMapping("/getTime")
    public String getTime(){
        return new Date().toString();
    }
}
