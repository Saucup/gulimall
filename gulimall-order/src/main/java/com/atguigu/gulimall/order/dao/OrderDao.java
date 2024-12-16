package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chen
 * @email chenxi9909@gmail.com
 * @date 2024-12-06 23:28:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
