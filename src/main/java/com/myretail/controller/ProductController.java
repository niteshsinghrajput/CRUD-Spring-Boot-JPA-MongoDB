package com.myretail.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.myretail.entity.ErrorDetails;
import com.myretail.entity.Product;
import com.myretail.entity.ProductNotFoundException;
import com.myretail.entity.ProductPrice;
import com.myretail.service.IProductService;
import com.myretail.utils.MyRetailConstants;

@Controller
@RequestMapping("productservice")
public class ProductController {
	
	private final Logger logger = org.slf4j.LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private IProductService service;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("healthcheck")
	public ResponseEntity<String> healthCheck(){
		String message = "MyRetail Service is up and running...!!!";
		logger.info(message);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") long id){
		
		if(id <= 0 ) {
			logger.error(MyRetailConstants.INVALID_ID);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Product product = service.getProductById(id);
		logger.debug("Product :: "+product);
		if(product == null) {
			String errorMessage = MyRetailConstants.ERR_PRODUCT_NOT_FOUND +id;
			logger.error(errorMessage);
			throw new ProductNotFoundException(errorMessage);
		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	
	@PutMapping("product/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product){
		
		if(id <= 0 ) {
			logger.error(MyRetailConstants.INVALID_ID);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		if(product == null) {
			logger.error(MyRetailConstants.INVALID_INPUT);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Product updatedProduct = service.updateProduct(id, product);
		
		
		return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
		
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("productPrice/{id}")
	public ResponseEntity<ProductPrice> getProductPrice(@PathVariable("id") long id){
		
		if(id <= 0 ) {
			logger.error(MyRetailConstants.INVALID_ID);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		logger.debug("Getting ProductPrice Detail for Product ID : {}", id);
		ProductPrice price = service.getProductPrice(id);
		
		if(price == null) {
			String errorMessage = MyRetailConstants.ERR_PRODUCT_PRICE_NOT_FOUND +id;
			logger.error(errorMessage);
			throw new ProductNotFoundException(errorMessage);
		}
		return new ResponseEntity<ProductPrice>(price, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param price
	 * @return
	 */
	@PostMapping("productPrice")
	public ResponseEntity<ProductPrice> createProductPrice(@RequestBody ProductPrice price) {
		
		logger.info("Saving ProductPrice information");
		ProductPrice createdPrice = service.saveProductPrice(price);
		return new ResponseEntity<ProductPrice>(createdPrice, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param productId
	 * @param price
	 * @return
	 */
	@PutMapping("productPrice/{id}")
	public ResponseEntity<ProductPrice> updateProductPrice(@PathVariable("id") long productId, @RequestBody ProductPrice price){
		
		if(productId <= 0 ) {
			logger.error(MyRetailConstants.INVALID_ID);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} 
		
		ProductPrice updatedPrice = service.updateProductPrice(productId, price);
		return new ResponseEntity<ProductPrice>(updatedPrice, HttpStatus.OK);
	}
	
	@ControllerAdvice
	@Controller
	public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	  @ExceptionHandler(ProductNotFoundException.class)
	  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(ProductNotFoundException ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	  }
	}

}
