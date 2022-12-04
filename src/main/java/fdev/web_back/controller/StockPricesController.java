package fdev.web_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fdev.web_back.dto.PrmStockPricesSearchDto;
import fdev.web_back.entity.StockPrices;
import fdev.web_back.service.StockPricesService;

/**
 * 株価 Controller
 */
@Controller
@RequestMapping("/stock")
public class StockPricesController {

	/**
	 * 株価Service
	 */
	@Autowired
	private StockPricesService stockPricesService;

	/**
	 * 株価を取得
	 * @param model Model
	 * @return ユーザー情報一覧画面
	 */
	@GetMapping(value = "/{associationCode}")
	public String displayList(@PathVariable String associationCode, Model model) {

		PrmStockPricesSearchDto prm = new PrmStockPricesSearchDto();
		prm.setAssociationCode(associationCode);
		
		List<StockPrices> stockPricesList = stockPricesService.search(prm);
		model.addAttribute("stockPrices", stockPricesList);
		return "stock_prices/search";
	}
}