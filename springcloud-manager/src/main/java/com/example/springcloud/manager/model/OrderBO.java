package com.example.springcloud.manager.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class OrderBO {

    private String orderItemId;

    private Long orderId;

    private Long userId;
}
