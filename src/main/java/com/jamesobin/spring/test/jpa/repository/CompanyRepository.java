package com.jamesobin.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesobin.spring.test.jpa.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	
}
