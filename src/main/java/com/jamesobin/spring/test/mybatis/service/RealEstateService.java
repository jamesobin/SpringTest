package com.jamesobin.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamesobin.spring.test.mybatis.domain.RealEstate;
import com.jamesobin.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRespository;

	// 전달받은 id와 일치하는 부동산 매물 정보 얻어오기
	public RealEstate getRealEstate(int id) {
		
		// 전달받은 id와 일치하는 real_estate 행 조회
		RealEstate realEstate = realEstateRespository.selectRealEstate(id);
		
		return realEstate;
		
	}
	
	// 전달받은 월세보다 낮은 매물 정보 얻어오기
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		
		// 전달받은 월세보다 낮은 행을 real_estate에서 조회
		List<RealEstate> realEstateList = realEstateRespository.selectRealEstateByRentPrice(rentPrice);
		
		return realEstateList;
		
	}
	
	public List<RealEstate> getRealEstateByAreaAndPrice(int area, int price) {
		
		List<RealEstate> realEstateList = realEstateRespository.selectRealEstateByAreaAndPrice(area, price);
		
		return realEstateList;
		
	}
	
	public int addRealEstateByObject(RealEstate realEstate) {
		int count = realEstateRespository.insertRealEstateByObject(realEstate);
		
		return count;
	}
	
	public int addRealEstate(
			int realtorId
			, String address
			, int area
			, String type
			, int price
			, int rentPrice) {
		
		int count = realEstateRespository.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		
		return count;
		
	}
	
	public int updateRealEstate(
			int id
			, String type
			, int price) {
		
		int count = realEstateRespository.updateRealEstate(id, type, price);
		
		return count;
		
	}
	
	public int deleteRealEstate(int id) {
		
		int count = realEstateRespository.deleteRealEstate(id);
		
		return count;
		
	}
	
}
