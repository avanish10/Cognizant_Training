package com.cognizant.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.exception.StockNotFoundException;
import com.cognizant.model.Stock;
import com.cognizant.repository.StockRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Service
public class StockService {
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(StockService.class);
	
	@Autowired
	StockRepository stockRepository;
	
	@Transactional
	public Stock getStockByName(String name) throws StockNotFoundException
	{
		if(stockRepository.findByName(name)==null)
		{
			throw new StockNotFoundException("stock not found");
		}
		

		return stockRepository.findByName(name);
	}
	
	
}
