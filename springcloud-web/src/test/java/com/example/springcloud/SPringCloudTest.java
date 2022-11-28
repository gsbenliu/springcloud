package com.example.springcloud;

import com.example.springcloud.core.OrderCore;
import com.example.springcloud.manager.model.OrderBO;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

@SpringBootTest
public class SPringCloudTest extends AbstractTestNGSpringContextTests {

    @Resource
    private OrderCore orderCore;

    @Test
    public void saveTest() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                OrderBO orderBO = new OrderBO();
                orderBO.setOrderId(Long.parseLong("111" + i + j));
                orderBO.setUserId(Long.parseLong("222" + i));
                orderBO.setOrderItemId("333" + i + j);
                orderCore.save(orderBO);
            }
        }
    }
}