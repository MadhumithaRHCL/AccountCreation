package com.stock.dto;

import java.time.LocalDate;

import com.stock.entity.Stock;

public class PurchaseDetailsResponseDto {
	
	private Long purchseId;
	private Integer purchaseQuantity;
	private LocalDate purchaseDate;
	private Double grossPrice;
	private Stock stock;
	public Long getPurchseId() {
		return purchseId;
	}
	public void setPurchseId(Long purchseId) {
		this.purchseId = purchseId;
	}
	public Integer getPurchaseQuantity() {
		return purchaseQuantity;
	}
	public void setPurchaseQuantity(Integer purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	

	public PurchaseDetailsResponseDto() {
		super();
	}
	public Double getGrossPrice() {
		return grossPrice;
	}
	public void setGrossPrice(Double grossPrice) {
		this.grossPrice = grossPrice;
	}
	@Override
	public String toString() {
		return "PurchaseDetailsResponseDto [purchseId=" + purchseId + ", purchaseQuantity=" + purchaseQuantity
				+ ", purchaseDate=" + purchaseDate + ", grossPrice=" + grossPrice + ", stock=" + stock + "]";
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
}
