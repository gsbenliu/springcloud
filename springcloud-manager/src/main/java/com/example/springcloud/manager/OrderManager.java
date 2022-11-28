package com.example.springcloud.manager;

import com.example.springcloud.dal.mapper.OrderMapper;
import com.example.springcloud.dal.model.OrderDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class OrderManager {

    @Resource
    private OrderMapper orderMapper;

    public void save(OrderDO orderDO){
        orderMapper.insert(orderDO);
    }
}
