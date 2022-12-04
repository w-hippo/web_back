package fdev.web_back.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fdev.web_back.dto.PrmStockPricesSearchDto;
import fdev.web_back.entity.StockPrices;
import fdev.web_back.service.StockPricesService;

/**
 * 株価API Controller
 */
@RestController
@RequestMapping("/api/stock")
public class StockPricesApiController {

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
	public List<StockPrices> displayList(@PathVariable String associationCode, Model model) {

		PrmStockPricesSearchDto prm = new PrmStockPricesSearchDto();
		prm.setAssociationCode(associationCode);
		
//		List<StockPrices> stockPricesList = stockPricesService.search(prm);
//		model.addAttribute("stockPrices", stockPricesList);
//		return "stock_prices/search";
		return stockPricesService.search(prm);
	}
}
