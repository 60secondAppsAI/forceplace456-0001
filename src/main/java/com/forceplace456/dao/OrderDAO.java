package com.forceplace456.dao;

import java.util.List;

import com.forceplace456.dao.GenericDAO;
import com.forceplace456.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


