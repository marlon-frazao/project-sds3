package com.marlon.frazao.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlon.frazao.dsvendas.dto.SellerDTO;
import com.marlon.frazao.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		return repository.findAll().stream().map(x -> x.toDTO()).collect(Collectors.toList());
	}
}
