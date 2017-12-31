package com.fenghao.mapper;

import java.util.List;

import com.fenghao.bean.QueryVo;
import com.fenghao.bean.User;

public interface UserMapper {

	/**
	 * 查询数据库中User的总数
	 * @return
	 */
	public Integer getUserCount();
	
	/**
	 * 根据用户名和性别查询User对象
	 * @param user
	 * @return
	 */
	public List<User> getUserByUsernameAndSex(User user);
	/**
	 * 根据ids查询多个User
	 * @param vo
	 * @return
	 */
	public List<User> getUserByIds(QueryVo vo);
	
	public List<User> getUserByIds(Integer[] ids);
	
	public List<User> getUserByIds(List<Integer> idsList);
	
	/**
	 * 查询User，且查询关联的Order
	 * @return
	 */
	public List<User> getUserAssOrder();
	
	
	
	
	
	
	
}
