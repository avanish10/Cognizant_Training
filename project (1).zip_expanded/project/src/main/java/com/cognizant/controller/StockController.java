package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.exception.StockNotFoundException;
import com.cognizant.model.Stock;
import com.cognizant.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@GetMapping("/dailySharePrice/{name}")
	public Stock getStock(@PathVariable String name) throws StockNotFoundException
	{
		return stockService.getStockByName(name);
	}
	
	
}
