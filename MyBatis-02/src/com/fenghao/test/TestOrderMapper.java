package com.fenghao.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fenghao.bean.Order;
import com.fenghao.bean.OrderAssUser;
import com.fenghao.bean.QueryVo;
import com.fenghao.bean.User;
import com.fenghao.mapper.OrderMapper;
import com.fenghao.utils.SqlSessionUtils;

public class TestOrderMapper {

	@Test
	public void testGetOrderById(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		Order o = new Order();
		o.setId(3);
		Order order = mapper.getOrderById(o);
		System.out.println(order);
	}
	
	@Test
	public void testGetUserByIdAndOname(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		QueryVo vo = new QueryVo();
		User u = new User();
		u.setId(1);
		Order o = new Order();
		o.setName("电视机");
		vo.setOrder(o);
		vo.setUser(u);
		User user = mapper.getUserByIdAndOname(vo);
		System.out.println(user);
	}
	
	
	
	@Test
	public void testGetOrderAssUser(){
		
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		QueryVo vo = new QueryVo();
		List<OrderAssUser> orders = mapper.getOrderAssUser(vo);
		for (OrderAssUser orderAssUser : orders) {
			System.out.println(orderAssUser);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
