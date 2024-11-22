package com.jamesobin.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesobin.spring.test.jpa.domain.Recruit;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

//	2. Parameter 조건 조회
//	Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
	public List<Recruit> findByCompanyId(int companyId);
	
//	3. 복합 조건 조회
//	웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	public List<Recruit> findByPositionAndType(String position, String type);
	
//	4. 복합 조건 조회
//	정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
//	메소드명 규칙을 검색해서 찾아보세요.
//	WHERE `type` = "정규직" OR `salary` >= 9000; 
//	public List<Recruit> findByTypeOrSalary(String type, int salary);
	
//	5. 정렬 제한 조건
//	계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
	public List<Recruit> findTop3ByOrderBySalaryDesc();
	
//	6. 범위 조회
//	성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
	public List<Recruit> findByRegionAndSalaryBetween(String region, int start, int end);
	
//	7. Native query
//	마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
	
	
}
