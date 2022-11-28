package com.example.springcloud.manager;


import com.example.springcloud.dal.mapper.OrderItemMapper;
import com.example.springcloud.dal.model.OrderItemDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class OrderItemManager {

    @Resource
    private OrderItemMapper orderItemMapper;

    public void save(OrderItemDO orderItemDO) {
        orderItemMapper.insert(orderItemDO);
    }
}
