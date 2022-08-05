package com.example.springcloudcore;

import com.example.springcloudmanager.SpringCloudManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringCloudCore {

    @Autowired
    private SpringCloudManager springCloudManager;

    public String call(String param) {
        String result = springCloudManager.call(param);
        return String.join("SpringCloudCore,", result);
    }
}
