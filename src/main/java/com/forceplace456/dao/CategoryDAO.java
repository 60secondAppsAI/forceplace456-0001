package com.forceplace456.dao;

import java.util.List;

import com.forceplace456.dao.GenericDAO;
import com.forceplace456.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


