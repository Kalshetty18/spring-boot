package com.crm.microservices.currencyconversionservices;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalcalculatedAmount;
	private String environment;
	
	public CurrencyConversion(long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalcalculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.setTotalcalculatedAmount(totalcalculatedAmount);
		this.environment = environment;
	}
	public CurrencyConversion() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public BigDecimal getTotalcalculatedAmount() {
		return totalcalculatedAmount;
	}
	public void setTotalcalculatedAmount(BigDecimal totalcalculatedAmount) {
		this.totalcalculatedAmount = totalcalculatedAmount;
	}
	
	

}
