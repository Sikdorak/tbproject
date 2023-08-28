package com.sikdorak.spring.tb.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProductDtoList {
	private List<KioskDto> dtoList;
	
	public ProductDtoList(List<KioskDto> dtoList) {
		this.dtoList = dtoList;
	}
}
