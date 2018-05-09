package com.myretail.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myretail.entity.Product;
import com.myretail.entity.ProductNotFoundException;
import com.myretail.entity.ProductPrice;
import com.myretail.repository.ProductRepository;
import com.myretail.utils.HttpClientUtil;
import com.myretail.utils.MyRetailConstants;

@Service
public class ProductService implements IProductService {
	
	private final Logger logger = org.slf4j.LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository repo;

	public Product getProductById(long id) {
		
		ProductPrice price = null;
		Product product = null;
		
		try {
			logger.debug("Product price : "+price);
			String productName = HttpClientUtil.getProductName(id);
			
			logger.debug("ProductName from Inter API Call : {}", productName);
			price = getProductPrice(id);
			product = new Product();
			product.setName(productName);
			product.setId(id);
			product.setCurrentPrice(price);
			return product;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}

	@Override
	public ProductPrice getProductPrice(long id) {
		
		logger.debug("Getting product price details from database for ID {} ", id);
		return repo.findByProductId(id);
	}

	@Override
	public ProductPrice saveProductPrice(ProductPrice price) {
		
		logger.debug("Saving product price details into database for ID {} ", price.getProductId());
		return repo.save(price);
	}

	@Override
	public ProductPrice updateProductPrice(long productId, ProductPrice price) {
		
		logger.debug("Getting existing product price details from database for ID {} ", price.getProductId());
		ProductPrice existingPrice = repo.findByProductId(productId);
		
		if(existingPrice == null) {
			
			throw new ProductNotFoundException(MyRetailConstants.ERR_PRODUCT_PRICE_NOT_FOUND + productId);
		}
		
		logger.debug("updating price details of product into database for ID {} ", price.getProductId());
		existingPrice.setPrice(price.getPrice());
		existingPrice.setCurrencyCode(price.getCurrencyCode());
		
		return saveProductPrice(existingPrice);
	}

	@Override
	public Product updateProduct(long productId, Product product) {
		
		logger.debug("Updating product detail for Product ID : {}", productId);
		ProductPrice price = updateProductPrice(productId, product.getCurrentPrice());
		product.setCurrentPrice(price);
		return product;
	}
	
	
	
}
