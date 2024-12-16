package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chen
 * @email chenxi9909@gmail.com
 * @date 2024-12-06 22:49:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
