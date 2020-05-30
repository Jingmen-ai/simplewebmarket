package com.mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="shopbuy")
public class BuyEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int goodbuyid;
	@Column
	private String goodbuyname;
	@Column
	private String goodbuyprice;
	@Column
	private int goodbuynum;
	@Column
	private String allprice;
	
	public String getAllprice() {
		return allprice;
	}
	public void setAllprice(String allprice) {
		this.allprice = allprice;
	}
	public int getGoodbuyid() {
		return goodbuyid;
	}
	public void setGoodbuyid(int goodbuyid) {
		this.goodbuyid = goodbuyid;
	}
	public String getGoodbuyname() {
		return goodbuyname;
	}
	public void setGoodbuyname(String goodbuyname) {
		this.goodbuyname = goodbuyname;
	}
	public String getGoodbuyprice() {
		return goodbuyprice;
	}
	public void setGoodbuyprice(String goodbuyprice) {
		this.goodbuyprice = goodbuyprice;
	}
	public int getGoodbuynum() {
		return goodbuynum;
	}
	public void setGoodbuynum(int goodbuynum) {
		this.goodbuynum = goodbuynum;
	}
	
}
