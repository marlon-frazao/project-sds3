package com.marlon.frazao.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlon.frazao.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
