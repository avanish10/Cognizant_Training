package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
	
	public Stock findByName(String name);

}
