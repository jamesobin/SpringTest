package com.jamesobin.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jamesobin.spring.test.mvc.domain.Seller;

@Mapper
public interface SellerRepository {

	public int insertSeller(
			@Param("nickname") String nickname
			, @Param("profileImage") String profileImage
			, @Param("temperature") double temperature);
	
	public Seller selectLastSeller();
	
	public Seller selectSellerById(@Param("id") int id);
	
}
