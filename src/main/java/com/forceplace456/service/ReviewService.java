package com.forceplace456.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.forceplace456.domain.Review;
import com.forceplace456.dto.ReviewDTO;
import com.forceplace456.dto.ReviewSearchDTO;
import com.forceplace456.dto.ReviewPageDTO;
import com.forceplace456.dto.ReviewConvertCriteriaDTO;
import com.forceplace456.service.GenericService;
import com.forceplace456.dto.common.RequestDTO;
import com.forceplace456.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ReviewService extends GenericService<Review, Integer> {

	List<Review> findAll();

	ResultDTO addReview(ReviewDTO reviewDTO, RequestDTO requestDTO);

	ResultDTO updateReview(ReviewDTO reviewDTO, RequestDTO requestDTO);

    Page<Review> getAllReviews(Pageable pageable);

    Page<Review> getAllReviews(Specification<Review> spec, Pageable pageable);

	ResponseEntity<ReviewPageDTO> getReviews(ReviewSearchDTO reviewSearchDTO);
	
	List<ReviewDTO> convertReviewsToReviewDTOs(List<Review> reviews, ReviewConvertCriteriaDTO convertCriteria);

	ReviewDTO getReviewDTOById(Integer reviewId);







}





