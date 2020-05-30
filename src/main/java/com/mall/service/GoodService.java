package com.mall.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.data.Result;
import com.mall.entity.UserEntity;
import com.mall.entity.BuyEntity;
import com.mall.entity.GoodEntity;
import com.mall.rep.buyRep;
import com.mall.rep.goodRep;
@Resource
@Service
public class GoodService {
@Autowired
private goodRep goodRep;
@Autowired
private buyRep buyRep;
public GoodEntity One(int id) {
	GoodEntity goodEntity=goodRep.getOne(id);
	return goodEntity;
}
 public List<GoodEntity> show() {
	
	return goodRep.findAll();
	
}
public void add(String name,String price,int num) {
	GoodEntity good=new GoodEntity();
	good.setGoodname(name);
	good.setGoodprice(price);
	good.setGoodnum(num);
	good.setGoodid((int) goodRep.count()+1);
	goodRep.save(good);
}
public List<GoodEntity> cycle(){
	List<BuyEntity> list=buyRep.findAll();
	for(int i=0;i<list.size();i++) {
		BuyEntity buyEntity=list.get(i);
		String nameString=buyEntity.getGoodbuyname();
		int num=buyEntity.getGoodbuynum();
		GoodEntity goodEntity=goodRep.goodEntity1(nameString);
		int nums=goodEntity.getGoodnum()-num;
		goodRep.change(nameString, nums);
	}
	return goodRep.findAll();
}
public void pinglun(String pinglun) {
	List<BuyEntity> list=buyRep.findAll();
	for(int i=0;i<list.size();i++) {
		BuyEntity buyEntity=list.get(i);
		String nameString=buyEntity.getGoodbuyname();
		GoodEntity goodEntity=goodRep.goodEntity1(nameString);
		goodRep.pinglun(nameString, pinglun);
	}
}
}
