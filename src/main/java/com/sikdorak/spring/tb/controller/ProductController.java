package com.sikdorak.spring.tb.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sikdorak.spring.tb.service.KioskService;

@RestController
@RequestMapping("/api/*")
public class ProductController {
	
	private KioskService service;
	
	@PostMapping("updateBurger")
	public void updateBurger(@RequestBody Map<String, Object> requestData) {
		String p_id = (String) requestData.get("productId");
		String p_name = (String) requestData.get("productName");
		int p_price = (int) requestData.get("productPrice");
		service.updateBurger(p_id,p_name,p_price);
	}

}
