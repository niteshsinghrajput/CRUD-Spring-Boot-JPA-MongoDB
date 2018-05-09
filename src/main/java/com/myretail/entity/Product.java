package com.myretail.entity;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Product {
	
	@Id
	private long id;
	private String name;
	
	private ProductPrice currentPrice;
	
	public Product() {

	}

	public Product(long id, String name, ProductPrice currentPrice) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public ProductPrice getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(ProductPrice currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", currentPrice=" + currentPrice + "]";
	}
	
	

}
