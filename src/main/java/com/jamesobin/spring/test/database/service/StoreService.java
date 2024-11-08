package com.jamesobin.spring.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamesobin.spring.test.database.domain.Store;
import com.jamesobin.spring.test.database.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository; // repository 안에 있는 메소드를 사용하기 위함

	// 가게 리스트 얻어오기
	public List<Store> getStoreList() {
		// 가게 정보를 얻어와서 리턴한다. but 조회하는 기능은 service의 역할이 아님
		// store 테이블의 모든 행 조회
		List<Store> storeList = storeRepository.selectStoreList();
		
		return storeList;
	}
	
}
