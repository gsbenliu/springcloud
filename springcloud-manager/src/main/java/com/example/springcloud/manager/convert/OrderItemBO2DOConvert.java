package com.example.springcloud.manager.convert;

import com.example.springcloud.dal.model.OrderItemDO;
import com.example.springcloud.manager.model.OrderBO;

public class OrderItemBO2DOConvert {

    public static OrderItemDO orderBO2DOConvert(OrderBO orderBO) {
        OrderItemDO orderItemDO = new OrderItemDO();
        orderItemDO.setOrderId(orderBO.getOrderId());
        orderItemDO.setUserId(orderBO.getUserId());
        orderItemDO.setOrderItemId(orderBO.getOrderItemId());
        return orderItemDO;
    }
}
