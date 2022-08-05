package com.example.springcloudmanager;

import org.springframework.stereotype.Component;

@Component
public class SpringCloudManager {

    public String call(String param) {
        return String.join("SpringCloudManager,", param);
    }
}
