package com.example.springcloud.manager.convert;

import com.example.springcloud.dal.model.OrderDO;
import com.example.springcloud.manager.model.OrderBO;

public class OrderBO2DOConvert {

    public static OrderDO orderBO2DOConvert(OrderBO orderBO){
        OrderDO orderDO = new OrderDO();
        orderDO.setOrderId(orderBO.getOrderId());
        orderDO.setUserId(orderBO.getUserId());
        return orderDO;
    }
}
