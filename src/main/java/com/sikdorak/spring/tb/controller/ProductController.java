package com.sikdorak.spring.tb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sikdorak.spring.tb.dto.KioskDto;
import com.sikdorak.spring.tb.dto.ProductDtoList;
import com.sikdorak.spring.tb.service.KioskService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/*")
public class ProductController {
	
	
	private KioskService service;

	@GetMapping("updateBurger")
	public ProductDtoList updateBurger(KioskDto kioskDto) {
		service.updateBurger(kioskDto);
		return service.getMenuList();
	}
	
	
	

}
