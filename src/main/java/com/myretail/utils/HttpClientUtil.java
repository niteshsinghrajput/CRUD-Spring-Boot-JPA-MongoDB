package com.myretail.utils;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.myretail.models.ProductDetail;

public class HttpClientUtil {
	
	private final static Logger logger = org.slf4j.LoggerFactory.getLogger(HttpClientUtil.class);
	
	public static ProductDetail getProductDetail(long id) {
		
		ProductDetail detail = null;
		logger.debug("Getting product detail from internal API call..!!!");
		RestTemplate restTemplate = new RestTemplate();
		String url = MyRetailConstants.ENDPINT+id+MyRetailConstants.QUERY;
		
		try {
			logger.debug("Service EndPoint is {} ", url);
			detail = restTemplate.getForObject(url,ProductDetail.class);
			
			if(detail != null) {
				logger.debug("Product Name is {} of given Product ID : {}",detail.getProduct().getItem().getProductDescription().getTitle(), id);
				return detail;
			}
		}catch(HttpClientErrorException e) {
			
			HttpStatus status = e.getStatusCode();
			logger.error("Unable to get Product Details while calling internal APIs, HttpStatus : {}", status);
		}
		
			
		return detail;
		
	}
	
	public static String getProductName(long id) {
		
		ProductDetail detail = getProductDetail(id);
		String productName = detail.getProduct().getItem().getProductDescription().getTitle();
		return productName;
	}
	
	public static void main(String[] args) {
		
		ProductDetail d = getProductDetail(13860428);
		System.out.println("Done....."+d);
	}
}
