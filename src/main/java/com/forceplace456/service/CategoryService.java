package com.forceplace456.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.forceplace456.domain.Category;
import com.forceplace456.dto.CategoryDTO;
import com.forceplace456.dto.CategorySearchDTO;
import com.forceplace456.dto.CategoryPageDTO;
import com.forceplace456.dto.CategoryConvertCriteriaDTO;
import com.forceplace456.service.GenericService;
import com.forceplace456.dto.common.RequestDTO;
import com.forceplace456.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CategoryService extends GenericService<Category, Integer> {

	List<Category> findAll();

	ResultDTO addCategory(CategoryDTO categoryDTO, RequestDTO requestDTO);

	ResultDTO updateCategory(CategoryDTO categoryDTO, RequestDTO requestDTO);

    Page<Category> getAllCategorys(Pageable pageable);

    Page<Category> getAllCategorys(Specification<Category> spec, Pageable pageable);

	ResponseEntity<CategoryPageDTO> getCategorys(CategorySearchDTO categorySearchDTO);
	
	List<CategoryDTO> convertCategorysToCategoryDTOs(List<Category> categorys, CategoryConvertCriteriaDTO convertCriteria);

	CategoryDTO getCategoryDTOById(Integer categoryId);







}





