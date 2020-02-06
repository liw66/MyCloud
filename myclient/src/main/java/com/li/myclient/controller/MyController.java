package com.li.myclient.controller;

import com.li.myclient.service.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: mycloud
 * @description:
 * @author: Liwei
 * @create: 2020-01-13 11:43
 **/
@RestController
public class MyController {
    @Autowired
    private MyFeignClient myFeignClient;
    @Value("${server.port}")
    private String port;

    @GetMapping("/getTime")
    public String getTime(){
        return myFeignClient.getTime();
    }

    @GetMapping("/getConfig")
    public String getConfig(){
        return port;
    }
}
