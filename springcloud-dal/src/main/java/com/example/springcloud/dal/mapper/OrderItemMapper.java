package com.example.springcloud.dal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springcloud.dal.model.OrderItemDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItemDO> {
}
