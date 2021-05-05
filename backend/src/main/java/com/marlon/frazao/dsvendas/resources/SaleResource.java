package com.marlon.frazao.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlon.frazao.dsvendas.dto.SaleDTO;
import com.marlon.frazao.dsvendas.dto.SaleSuccessDTO;
import com.marlon.frazao.dsvendas.dto.SaleSumDTO;
import com.marlon.frazao.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		return ResponseEntity.ok().body(service.findAll(pageable));
	}
	
	@GetMapping(value = "/amount-by-seller")
	public  ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		return ResponseEntity.ok().body(service.amountGroupedBySeller());
	}
	
	@GetMapping(value = "/success-by-seller")
	public  ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		return ResponseEntity.ok().body(service.successGroupedBySeller());
	}
}
