package com.myretail.entity;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class ProductPrice {
	
	@Id
	@JsonIgnore
	private long productId;
	private double price;
	private String currencyCode;
	
	public ProductPrice() {
		
	}

	public ProductPrice(long productId, double price, String currencyCode) {
		super();
		this.productId = productId;
		this.price = price;
		this.currencyCode = currencyCode;
	}

	@JsonIgnore
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Override
	public String toString() {
		return "ProductPrice [productId=" + productId + ", price=" + price + ", currency=" + currencyCode + "]";
	}

}
