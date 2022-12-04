package fdev.web_back.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import fdev.web_back.dto.PrmStockPricesSearchDto;
import fdev.web_back.entity.StockPrices;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface StockPricesMapper {

	/**
	 * ユーザー情報検索
	 * @param prm 検索用リクエストデータ
	 * @return 検索結果
	 */
	List<StockPrices> search(PrmStockPricesSearchDto prm);
}