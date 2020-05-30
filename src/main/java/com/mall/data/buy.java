package com.mall.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class buy {
	private int goodbuyid;
	private String goodbuyname;
	private String goodbuyprice;
	private int goodbuynum;
	private String allprice;
	private String userbuy;
	private String pinglun;
	private String pinglunUser;
	
	public String getPinglunUser() {
		return pinglunUser;
	}
	public void setPinglunUser(String pinglunUser) {
		this.pinglunUser = pinglunUser;
	}
	public String getPinglun() {
		return pinglun;
	}
	public void setPinglun(String pinglun) {
		this.pinglun = pinglun;
	}
	public String getUserbuy() {
		return userbuy;
	}
	public void setUserbuy(String userbuy) {
		this.userbuy = userbuy;
	}
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
