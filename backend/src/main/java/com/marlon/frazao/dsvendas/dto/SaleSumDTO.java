package com.marlon.frazao.dsvendas.dto;

import java.io.Serializable;

import com.marlon.frazao.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;

	public SaleSumDTO() {}
	
	public SaleSumDTO(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellername(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
