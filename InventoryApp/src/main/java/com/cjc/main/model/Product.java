package com.cjc.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	
	private int productId;
	private String productName;
	private float productPrice;
	private String productdiscription;
	private int availableQuantity;
	
}
