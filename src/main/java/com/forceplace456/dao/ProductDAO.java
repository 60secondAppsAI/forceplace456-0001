package com.forceplace456.dao;

import java.util.List;

import com.forceplace456.dao.GenericDAO;
import com.forceplace456.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


