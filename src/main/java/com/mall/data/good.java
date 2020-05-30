package com.mall.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class good {
private int goodid;
private String goodname;
private String goodprice;
private int goodnum;
private String person;

public String getPerson() {
	return person;
}
public void setPerson(String person) {
	this.person = person;
}
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

}
