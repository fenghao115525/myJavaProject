package com.fenghao.mapper;

import java.util.List;

import com.fenghao.bean.Order;
import com.fenghao.bean.OrderAssUser;
import com.fenghao.bean.QueryVo;
import com.fenghao.bean.User;

public interface OrderMapper {

	/**
	 * 根据id查询Order
	 */
	public Order getOrderById(Order o);
	public User getUserByIdAndOname(QueryVo vo);
	/**
	 * 查询数据库中表orders中所有数据
	 */
	
	public List<OrderAssUser> getOrderAssUser(QueryVo vo);
	
}
