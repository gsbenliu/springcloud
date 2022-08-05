package com.example.springcloudservice;

import com.example.springcloud.api.SpringCloudApi;
import com.example.springcloudbiz.SpringCloudBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringCloudApiService implements SpringCloudApi {

    @Autowired
    private SpringCloudBiz springCloudBiz;

    @Override
    public String call(String param) {
        String result = springCloudBiz.call(param);
        log.info("SpringCloudApiService call method");
        return String.join("加油！", result);
    }
}
