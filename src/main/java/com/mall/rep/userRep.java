package com.mall.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mall.entity.UserEntity;
public interface userRep extends JpaRepository<UserEntity,Integer>{
	@Query(value="select * from user where username=:name1",nativeQuery=true)
	public UserEntity userEntity(@Param("name1") String name);
	//public UserEntity userEntity(@Param("userid1") int id);
	//UserEntity findByuserid(Integer userid);
	//@Query(value="select * from user where username=:name1",nativeQuery=true)
	//public UserEntity userEntity(String name, String password, String isadmin);

	
	
	
}
