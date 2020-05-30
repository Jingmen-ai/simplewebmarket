package com.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.introspect.AnnotationCollector.OneAnnotation;
import com.mall.data.Result;
import com.mall.data.buy;
import com.mall.data.good;
import com.mall.data.user;
import com.mall.entity.BuyEntity;
import com.mall.entity.GoodEntity;
import com.mall.entity.WaitEntity;
import com.mall.service.BuyService;
import com.mall.service.GoodService;
import com.mall.service.UserService;
import com.mall.service.WaitService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@CrossOrigin
public class webController {
	@Autowired	
	UserService userservice;
	@Autowired
	GoodService GoodService;
	@Autowired
	BuyService BuyService;
	@Autowired
	WaitService WaitService;
	@CrossOrigin
	@PostMapping(value="/login")
	@ResponseBody
	public Result mul(@RequestBody user user) {
		Result result=new Result();
		String name=user.getName();
		String pass=user.getPassword();
		String typeString=user.isIsadmin();
		
		if(this.userservice.login(name, pass, typeString)==1)
		{
			result.setCode(1);}
		else result.setCode(0);
		return result;
	}
	@CrossOrigin
	@PostMapping(value="/reg")
	@ResponseBody
	public Result reg(@RequestBody user user) {
		Result result=new Result();
		String name=user.getName();
		String pass=user.getPassword();
		System.out.println(name+pass);
		userservice.reg(name, pass);
		
		return result;
	}
	@CrossOrigin
	@PostMapping(value="/shop")
	@ResponseBody
	public List<GoodEntity> shopshow(@RequestBody user user) {
		BuyService.clear();
		return GoodService.show();
	}
	@CrossOrigin
	@PostMapping(value="/buy")
	@ResponseBody
	public List<BuyEntity> buyshow(@RequestBody buy buy){
		int id=buy.getGoodbuyid();
		int num=buy.getGoodbuynum();
		GoodEntity good=GoodService.One(id);
		String name=good.getGoodname();
		String price=good.getGoodprice();
		return BuyService.buys(id, name, price, num);
	}
	@CrossOrigin
	@PostMapping(value="/del")
	@ResponseBody
	public List<BuyEntity> delshow(@RequestBody buy buy){
		int id=buy.getGoodbuyid();
		return BuyService.del(id);
	}
	@CrossOrigin
	@PostMapping(value="/compute")
	@ResponseBody
	public String ret(@RequestBody buy buy) {
		GoodService.cycle();
		String name=buy.getPinglunUser();
		String pinglunString=buy.getPinglun();
		String pinglun=pinglunString+"  评论人："+name;
		GoodService.pinglun(pinglun);
		return BuyService.compute();
	}
	@CrossOrigin
	@PostMapping(value="/computesingle")
	@ResponseBody
	public String ret1(@RequestBody buy buy) {
		return BuyService.compute();
	}
	@CrossOrigin
	@PostMapping(value="/newgood")
	@ResponseBody
	public Result newgood(@RequestBody good good) {
		Result result=new Result();
		String name=good.getGoodname();
		String price=good.getGoodprice();
		int num=good.getGoodnum();
		String person=good.getPerson();
		//System.out.println(name+pass);
		WaitService.newgood(name, price, num, person);
		
		return result;
	}
	@CrossOrigin
	@PostMapping(value="/shenhe")
	@ResponseBody
	public List<WaitEntity> wait(@RequestBody good good){
		return WaitService.view();
	}
	@CrossOrigin
	@PostMapping(value="/pass")
	@ResponseBody
	public List<WaitEntity> pass(@RequestBody good good){
		int id=good.getGoodid();
		WaitEntity waitEntity=WaitService.entity(id);
		String name=waitEntity.getGoodname();
		String price=waitEntity.getGoodprice();
		int num=waitEntity.getGoodnum();
		GoodService.add(name, price, num);
		WaitService.delone(id);
		return WaitService.view();
	}
	@CrossOrigin
	@PostMapping(value="/notpass")
	@ResponseBody
	public List<WaitEntity> notpass(@RequestBody good good){
		int id=good.getGoodid();
		WaitService.delone(id);
		return WaitService.view();
	}
}
