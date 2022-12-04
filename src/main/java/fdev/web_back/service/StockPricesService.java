package fdev.web_back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fdev.web_back.dao.StockPricesMapper;
import fdev.web_back.dto.PrmStockPricesSearchDto;
import fdev.web_back.entity.StockPrices;

/**
 * 株価 Service
 */
@Service
public class StockPricesService {
	/**
	 * 株価 Mapper
	 */
	@Autowired
	private StockPricesMapper stockPricesMapper;

	/**
	 * 株価検索
	 * @param userSearchRequest リクエストデータ
	 * @return 検索結果
	 */
	public List<StockPrices> search(PrmStockPricesSearchDto prm) {
		return stockPricesMapper.search(prm);
	}
}