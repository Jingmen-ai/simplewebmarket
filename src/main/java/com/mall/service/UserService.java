package com.mall.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.entity.UserEntity;
import com.mall.rep.userRep;
@Service
public class UserService{
	@Resource
@Autowired
private userRep userRep;
	int id=1;

	
	public int login(String name, String password, String isadmin) {
		// TODO Auto-generated method stub
		
		//UserEntity userEntity=userRep.userEntity0(name,password,isadmin);
		UserEntity userEntity=userRep.userEntity(name);
		if(userEntity!=null) {
		//System.out.println(userEntity.getUsername()+userEntity.getUserpass());
		//userRep.findById(name);
		if(name.equals(userEntity.getUsername())&&password.equals(userEntity.getUserpass())&&isadmin.equals(userEntity.getIsadmin())) {
		return 1;}}
		else return 0;
		return 0;
	}

	//@Transactional
	public void reg(String name, String password) {
		// TODO Auto-generated method stub
		UserEntity userEntity=new UserEntity();
		id=(int)userRep.count()+1;
		id=id+1;
		userEntity.setUserid(id);
		userEntity.setUsername(name);
		userEntity.setUserpass(password);
		userEntity.setIsadmin("false");
		userRep.save(userEntity);
		
	}
	
}
