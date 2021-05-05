package com.marlon.frazao.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlon.frazao.dsvendas.dto.SellerDTO;
import com.marlon.frazao.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerResource {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
}
