package com.fenghao.bean;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable{
	
	private User user;
	private Order order;
	
	private Integer[] ids;//存储多个id值的数组
	private List<Integer> idsList;//存储多个id值的List集合
	
	public Integer[] getIds() {
		return ids;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	public List<Integer> getIdsList() {
		return idsList;
	}
	public void setIdsList(List<Integer> idsList) {
		this.idsList = idsList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
