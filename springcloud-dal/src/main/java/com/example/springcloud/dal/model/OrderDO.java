package com.example.springcloud.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_order")
@Data
public class OrderDO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long orderId;

    private Long userId;

}
