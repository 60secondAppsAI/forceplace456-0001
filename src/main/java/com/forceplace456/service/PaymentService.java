package com.forceplace456.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.forceplace456.domain.Payment;
import com.forceplace456.dto.PaymentDTO;
import com.forceplace456.dto.PaymentSearchDTO;
import com.forceplace456.dto.PaymentPageDTO;
import com.forceplace456.dto.PaymentConvertCriteriaDTO;
import com.forceplace456.service.GenericService;
import com.forceplace456.dto.common.RequestDTO;
import com.forceplace456.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PaymentService extends GenericService<Payment, Integer> {

	List<Payment> findAll();

	ResultDTO addPayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

	ResultDTO updatePayment(PaymentDTO paymentDTO, RequestDTO requestDTO);

    Page<Payment> getAllPayments(Pageable pageable);

    Page<Payment> getAllPayments(Specification<Payment> spec, Pageable pageable);

	ResponseEntity<PaymentPageDTO> getPayments(PaymentSearchDTO paymentSearchDTO);
	
	List<PaymentDTO> convertPaymentsToPaymentDTOs(List<Payment> payments, PaymentConvertCriteriaDTO convertCriteria);

	PaymentDTO getPaymentDTOById(Integer paymentId);







}





