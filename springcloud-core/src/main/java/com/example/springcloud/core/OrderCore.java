package com.example.springcloud.core;

import com.example.springcloud.dal.model.OrderDO;
import com.example.springcloud.manager.OrderItemManager;
import com.example.springcloud.manager.OrderManager;
import com.example.springcloud.manager.convert.OrderBO2DOConvert;
import com.example.springcloud.manager.convert.OrderItemBO2DOConvert;
import com.example.springcloud.manager.model.OrderBO;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class OrderCore {

    @Resource
    private OrderManager orderManager;

    @Resource
    private OrderItemManager orderItemManager;

    @Transactional
    public void save(OrderBO orderBO){
        OrderDO orderDO = OrderBO2DOConvert.orderBO2DOConvert(orderBO);
        orderManager.save(orderDO);
        orderBO.setOrderId(orderDO.getOrderId());
        orderItemManager.save(OrderItemBO2DOConvert.orderBO2DOConvert(orderBO));
    }

}
