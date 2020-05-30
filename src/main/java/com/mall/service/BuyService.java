package com.mall.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.entity.BuyEntity;
import com.mall.entity.GoodEntity;
import com.mall.rep.buyRep;
import com.mall.rep.goodRep;

import java.util.List;

@Resource
@Service
public class BuyService {
	@Autowired
	private buyRep buyRep;
	@Autowired
	private goodRep goodRep;
	public List<BuyEntity> buys(int id,String name,String price,int num) {
		BuyEntity buy=new BuyEntity();
		GoodEntity chaBuyEntity=goodRep.goodEntity1(name);
		if(chaBuyEntity!=null) {
		int cha=chaBuyEntity.getGoodnum();
		if(num>cha)num=cha;}
		buy.setGoodbuyid(id);
		buy.setGoodbuyname(name);
		buy.setGoodbuyprice(price);
		buy.setGoodbuynum(num);
		int all=num*Integer.parseInt(price);
		buy.setAllprice(String.valueOf(all));
		buyRep.save(buy);
		return buyRep.findAll();
	}
	public List<BuyEntity> del(int id){
		buyRep.deleteById(id);
		return buyRep.findAll();
	}
	public String compute() {
		
		return buyRep.buyEntity();
	}
	public void clear() {
		buyRep.deleteAll();
	}
	
}
