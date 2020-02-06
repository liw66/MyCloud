package com.li.myclient.service;

import com.li.myclient.service.impl.MyFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: mycloud
 * @description:
 * @author: Liwei
 * @create: 2020-01-13 15:08
 **/
@FeignClient(value="myservice",fallback = MyFeignClientFallback.class)
public interface MyFeignClient {

    @PostMapping("/getTime")
    public String getTime();
}
