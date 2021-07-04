package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository

public interface CountryRepository extends JpaRepository<Country, String> {
	@Query(value="select * from country c where c.co_name like %?1%", nativeQuery = true)
	List<Country> findCountriesBySubstring(String sub);
	
	@Query(value="select * from country c where c.co_name like %?1% order by c.co_name", nativeQuery = true)
	List<Country> findSortedCountriesBySubstring(String sub);
	
	@Query(value="select * from country c where c.co_name like ?1%", nativeQuery = true)
	List<Country> findCountriesByFirstLetter(String firstletter);
	
	
	
}
