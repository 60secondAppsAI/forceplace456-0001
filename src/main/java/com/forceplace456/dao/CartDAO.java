package com.forceplace456.dao;

import java.util.List;

import com.forceplace456.dao.GenericDAO;
import com.forceplace456.domain.Cart;





public interface CartDAO extends GenericDAO<Cart, Integer> {
  
	List<Cart> findAll();
	






}


