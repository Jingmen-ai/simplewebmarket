package com.mall.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mall.entity.BuyEntity;
import com.mall.entity.GoodEntity;
import com.mall.entity.UserEntity;

import antlr.collections.List;


public interface goodRep extends JpaRepository<GoodEntity,Integer>{
	@Query(value="select * from shop where goodbuyid=:id1",nativeQuery=true)
	public GoodEntity goodEntity(@Param("id1") int id);
	@Query(value="select * from shop where goodname=:name1",nativeQuery=true)
	public GoodEntity goodEntity1(@Param("name1") String name);
	@Transactional
	@Query(value="update shop set goodnum=:num1 where goodname=:name1",nativeQuery=true)
	@Modifying
	public void change(@Param("name1") String name,@Param("num1") int i);
	@Transactional
	@Query(value="update shop set pinlun_string=:pinglun1 where goodname=:name1",nativeQuery=true)
	@Modifying
	public void pinglun(@Param("name1") String name,@Param("pinglun1") String pinglun);
}
