package com.forceplace456.dao;

import java.util.List;

import com.forceplace456.dao.GenericDAO;
import com.forceplace456.domain.CartItem;





public interface CartItemDAO extends GenericDAO<CartItem, Integer> {
  
	List<CartItem> findAll();
	






}


