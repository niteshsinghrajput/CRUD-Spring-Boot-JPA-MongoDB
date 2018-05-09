package com.myretail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myretail.entity.ProductPrice;

public interface ProductRepository extends MongoRepository<ProductPrice, Long>{
	
	ProductPrice findByProductId(long id);
}
