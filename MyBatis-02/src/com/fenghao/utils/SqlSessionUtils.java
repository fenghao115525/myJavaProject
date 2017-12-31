package com.fenghao.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtils {
	private static SqlSessionFactory factory;
	//加载SqlMapConfig.xml配置文件
	static{
		
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("SqlMapConfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		factory = builder.build(in);
		
	}
	
	//获得SqlSession
	public static SqlSession getSqlSession(){
		
		return factory.openSession();
		
	}
	
	
	
	
	
	
}
