package com.example.springcloud.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_order_item")
@Data
public class OrderItemDO {

    @TableId(type = IdType.ASSIGN_ID)
    private String orderItemId;

    private Long orderId;

    private Long userId;
}
