package fdev.web_back.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 株価 検索用リクエストデータ
 */
@Data
public class PrmStockPricesSearchDto implements Serializable {

	/**
	 * 協会コード
	 */
	private String associationCode;

	private Date recordDate;
}
