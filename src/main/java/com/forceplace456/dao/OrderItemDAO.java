package com.forceplace456.dao;

import java.util.List;

import com.forceplace456.dao.GenericDAO;
import com.forceplace456.domain.OrderItem;





public interface OrderItemDAO extends GenericDAO<OrderItem, Integer> {
  
	List<OrderItem> findAll();
	






}


