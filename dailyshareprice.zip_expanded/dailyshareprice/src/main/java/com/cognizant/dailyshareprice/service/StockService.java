package com.cognizant.dailyshareprice.service;

import com.cognizant.dailyshareprice.feignclient.AuthClient;
import com.cognizant.dailyshareprice.exception.StockNotFoundException;
import com.cognizant.dailyshareprice.model.Stock;
import com.cognizant.dailyshareprice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class StockService {
	private static final Logger LOGGER = LoggerFactory.getLogger(StockService.class);

	@Autowired
	StockRepository repository;

	@Autowired
	AuthClient authClient;

	/**
	 * @param Header
	 * @return false
	 */
	public Boolean AuthorizeUser(String Header) {
		try{
			return authClient.verify(Header);
		}
		catch(Exception e) {
			return false;
		}
	}

	/**
	 * @return repository.findAll()
	 */
	@Transactional
	public List<Stock> getAllShares(){
		LOGGER.info("Inside getAllShares");
		LOGGER.info("End getAllShares");
		return repository.findAll();
	}
	
	/**
	 * @param stockName
	 * @return repository.findByStockName(stockName)
	 * @throws StockNotFoundException
	 */
	@Transactional
	public Stock getStockByName(String stockName) throws StockNotFoundException{
		LOGGER.info("Inside getStockByName");
		
		if(repository.findByStockName(stockName)==null)
			throw new StockNotFoundException("Stock Not Found");
		LOGGER.info("End getStockByName");
		return repository.findByStockName(stockName);
	}
	
	/**
	 * @param stockId
	 * @return repository.findByStockId(stockId)
	 * @throws StockNotFoundException
	 */
	@Transactional
	public Stock getShareById(String stockId) throws StockNotFoundException {
		LOGGER.info("Inside getShareById");
		if(repository.findByStockId(stockId)==null)
		{
			
			throw new StockNotFoundException("Stock Not Found");
	}
		LOGGER.info("End getShareById");
		return repository.findByStockId(stockId);
	}

	/**
	 * @param stockId
	 * @return repository.findStockValueById(stockId)
	 */
	public double getSharePriceById(String stockId) {
		LOGGER.info("Inside getSharePriceById");
			//System.out.println(stockId);
			LOGGER.info("End getSharePriceById");
		return repository.findStockValueById(stockId);//stockValueList;
	}
}
