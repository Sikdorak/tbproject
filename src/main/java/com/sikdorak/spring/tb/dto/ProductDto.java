package com.sikdorak.spring.tb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
	private String name;
	private int price;
}