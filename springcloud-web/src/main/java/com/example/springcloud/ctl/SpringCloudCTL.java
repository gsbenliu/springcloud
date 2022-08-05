package com.example.springcloud.ctl;

import com.example.springcloud.api.SpringCloudApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudCTL {

    @Autowired
    private SpringCloudApi springCloudApi;

    @RequestMapping(value = "/getAuthOpenId", method = RequestMethod.POST)
    public String call() {
        springCloudApi.call("这时我的一次调用！");
        return "ok";
    }
}
