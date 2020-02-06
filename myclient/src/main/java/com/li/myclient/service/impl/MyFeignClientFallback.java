package com.li.myclient.service.impl;

import com.li.myclient.service.MyFeignClient;
import org.springframework.stereotype.Service;

/**
 * @program: mycloud
 * @description:
 * @author: Liwei
 * @create: 2020-01-14 10:03
 **/
@Service
public class MyFeignClientFallback implements MyFeignClient {

    @Override
    public String getTime(){
        return "";
    }
}
