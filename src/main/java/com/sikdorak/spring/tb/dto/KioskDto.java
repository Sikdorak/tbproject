package com.sikdorak.spring.tb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KioskDto {
	private String p_id;
	private String p_name;
	private int p_price;

}
