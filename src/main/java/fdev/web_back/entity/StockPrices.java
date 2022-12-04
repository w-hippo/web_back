package fdev.web_back.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class StockPrices implements Serializable {
	private String associationCode;
	private Date recordDate;
	private Integer basePrice;
	private Integer diffPrice;
	private Integer assetValue;
}