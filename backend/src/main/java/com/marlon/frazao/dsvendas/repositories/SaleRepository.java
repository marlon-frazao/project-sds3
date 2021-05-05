package com.marlon.frazao.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.frazao.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
