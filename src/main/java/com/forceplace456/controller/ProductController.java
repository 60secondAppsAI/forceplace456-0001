package com.forceplace456.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.forceplace456.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.forceplace456.domain.Product;
import com.forceplace456.dto.ProductDTO;
import com.forceplace456.dto.ProductSearchDTO;
import com.forceplace456.dto.ProductPageDTO;
import com.forceplace456.service.ProductService;
import com.forceplace456.dto.common.RequestDTO;
import com.forceplace456.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/product")
@RestController
public class ProductController {

	private final static Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductService productService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Product> getAll() {

		List<Product> products = productService.findAll();
		
		return products;	
	}

	@GetMapping(value = "/{productId}")
	@ResponseBody
	public ProductDTO getProduct(@PathVariable Integer productId) {
		
		return (productService.getProductDTOById(productId));
	}

 	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ResponseEntity<?> addProduct(@RequestBody ProductDTO productDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = productService.addProduct(productDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/products")
	public ResponseEntity<ProductPageDTO> getProducts(ProductSearchDTO productSearchDTO) {
 
		return productService.getProducts(productSearchDTO);
	}	

	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = productService.updateProduct(productDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
