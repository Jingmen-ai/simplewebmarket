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
@Table(name="wait")
public class WaitEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int goodid;
	@Column
	private String goodname;
	@Column
	private String goodprice;
	@Column
	private int goodnum;
	@Column
	private String goodperson;
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getGoodprice() {
		return goodprice;
	}
	public void setGoodprice(String goodprice) {
		this.goodprice = goodprice;
	}
	public int getGoodnum() {
		return goodnum;
	}
	public void setGoodnum(int goodnum) {
		this.goodnum = goodnum;
	}
	public String getGoodperson() {
		return goodperson;
	}
	public void setGoodperson(String goodperson) {
		this.goodperson = goodperson;
	}
	
}
