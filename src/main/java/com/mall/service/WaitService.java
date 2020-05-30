package com.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.entity.WaitEntity;
import com.mall.rep.waitRep;

@Service
public class WaitService {
	@Autowired
	private waitRep waitRep;
	public void newgood(String name,String price,int num,String person) {
		int id=(int) waitRep.count()+1;
		WaitEntity wait=new WaitEntity();
		wait.setGoodid(id);
		wait.setGoodname(name);
		wait.setGoodprice(price);
		wait.setGoodnum(num);
		wait.setGoodperson(person);
		waitRep.save(wait);
	}
	public List<WaitEntity> view(){
		return waitRep.findAll();
	}
	public WaitEntity entity(int id) {
		return waitRep.getOne(id);
	}
	public void delone(int id) {
		waitRep.deleteById(id);
	}
}
