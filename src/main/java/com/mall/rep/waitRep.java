package com.mall.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.entity.GoodEntity;
import com.mall.entity.WaitEntity;

public interface waitRep extends JpaRepository<WaitEntity,Integer>{

}
