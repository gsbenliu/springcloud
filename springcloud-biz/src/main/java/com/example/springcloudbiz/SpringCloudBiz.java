package com.example.springcloudbiz;

import com.example.springcloudcore.SpringCloudCore;
import com.example.springcloudmanager.SpringCloudManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringCloudBiz extends BaseBiz {

    @Autowired
    private SpringCloudCore springCloudCore;

    @Autowired
    private SpringCloudManager springCloudManager;

    public String call(String param) {
        String result = springCloudManager.call(param);
        result = springCloudCore.call(result);
        return String.join("SpringCloudBiz,", result);
    }
}
