package com.li.myclient.service;

import com.li.myclient.service.impl.MyFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: mycloud
 * @description:
 * @author: Liwei
 * @create: 2020-01-13 15:08
 **/
@FeignClient(value="myservice",fallback = MyFeignClientFallback.class)
public interface MyFeignClient {

    @GetMapping("/getTime")
    public String getTime();
}
