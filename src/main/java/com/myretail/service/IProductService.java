package com.myretail.service;

import com.myretail.entity.Product;
import com.myretail.entity.ProductPrice;

public interface IProductService {
	
	Product getProductById(long id);
	ProductPrice getProductPrice(long id);
	
	ProductPrice saveProductPrice(ProductPrice price);
	ProductPrice updateProductPrice(long productId, ProductPrice price);
	
	Product updateProduct(long productId, Product product);

}
