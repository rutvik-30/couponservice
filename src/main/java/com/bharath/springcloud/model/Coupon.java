package com.bharath.springcloud.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Coupon")
public class Coupon {
	
	
	@Id
	private String id;
	private String code;
	private BigDecimal discount;
	private LocalDateTime expDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public LocalDateTime getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDateTime expDate) {
		this.expDate = expDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
