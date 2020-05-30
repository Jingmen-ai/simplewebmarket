package com.mall.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mall.entity.BuyEntity;
import com.mall.entity.GoodEntity;
import com.mall.entity.UserEntity;

public interface buyRep extends JpaRepository<BuyEntity,Integer>{
	@Query(value="select sum(allprice) from shopbuy",nativeQuery=true)
	public String buyEntity();
	@Query(value="select * from shopbuy where goodbuyname=:name1",nativeQuery=true)
	public BuyEntity buyEntity1(@Param("name1") String name);
}
