package com.fenghao.bean;

import java.io.Serializable;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Order implements Serializable {

	/**
	 * `id` int(11) NOT NULL AUTO_INCREMENT,
  		`user_id` int(11) NOT NULL COMMENT '下单用户id',
  		`number` varchar(32) NOT NULL COMMENT '订单号',
  		`createtime` datetime NOT NULL COMMENT '创建订单时间',
  	`	note` varchar(100) DEFAULT NULL COMMENT '备注',
  		`name` varchar(100) DEFAULT NULL,
	 */
	private Integer id;
	private Integer userId;
	private String number;
	private Date createtime;
	private String note;
	private String name;
	
	//表示Order与User之间的关联关系
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + ", name=" + name + ", user=" + user + "]";
	}
	
	
	
	
}
