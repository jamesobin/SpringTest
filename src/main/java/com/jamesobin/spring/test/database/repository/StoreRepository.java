package com.jamesobin.spring.test.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jamesobin.spring.test.database.domain.Store;

@Mapper
public interface StoreRepository {
	
	// 서비스에서 store의 모든 행을 조회하는 역할
	// store 테이블 전체 행 조회
	public List<Store> selectStoreList();

}
