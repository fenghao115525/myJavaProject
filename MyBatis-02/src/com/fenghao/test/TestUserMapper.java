package com.fenghao.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fenghao.bean.QueryVo;
import com.fenghao.bean.User;
import com.fenghao.mapper.UserMapper;
import com.fenghao.utils.SqlSessionUtils;

public class TestUserMapper {

	@Test
	public void testGetUserCount(){
		//获得SqlSession
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		//获得UserMapper接口的代理对象
		UserMapper userMapperProxy = sqlSession.getMapper(UserMapper.class);
		Integer userCount = userMapperProxy.getUserCount();
		System.out.println(userCount);
	}
	@Test
	public void testGetUserByUsernameAndSex(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
//		user.setUsername("王五");
//		user.setSex("1");
		List<User> userList = mapper.getUserByUsernameAndSex(user);
		for (User user2 : userList) {
			System.out.println(user2);
		}
	}
	
	@Test
	public void testGetUserByIds(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		QueryVo vo = new QueryVo();
		Integer[] ids = new Integer[4];
		ids[0] = 24;
		ids[1] = 25;
		ids[2] = 26;
		ids[3] = 27;
		vo.setIds(ids);
		List<User> userList = mapper.getUserByIds(vo);
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
	@Test
	public void testGetUserAssOrder(){
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> userList = mapper.getUserAssOrder();
		for (User user : userList) {
			System.out.println(user);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
