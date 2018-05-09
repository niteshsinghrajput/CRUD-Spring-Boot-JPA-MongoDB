package com.myretail.controller;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.myretail.entity.Product;
import com.myretail.entity.ProductPrice;
import com.myretail.service.IProductService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=ProductController.class)
public class ProductControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IProductService service;
	
	ProductPrice mockProductPrice = new ProductPrice(101,1350,"USD");
	Product mcokProduct = new Product(101,"Test Product Name",mockProductPrice);
	
	String productJson = "{\"id\":\"101,\"name\":\"Test Product Name\",\"currentPrice\":{\"price\":\"1340.50,\"currencyCode\":\"USD\"}}";
	
	@Test
	public void getProductTest() throws Exception {
		
		Mockito.when(service.getProductById(Mockito.anyLong())).thenReturn(mcokProduct);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/productservice/product").accept(
				MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
	}
	
	
}
