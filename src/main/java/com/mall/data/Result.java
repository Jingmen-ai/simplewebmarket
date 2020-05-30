package com.mall.data;

import org.springframework.web.bind.annotation.ResponseBody;

import antlr.collections.List;

public class Result {
	
int Code;
String goodname;
String goodprice;
int goodnum;
//List<good> goods;
public int getCode() {
	return Code;
}

public void setCode(int code) {
	Code = code;
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
