package com.sikdorak.spring.tb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sikdorak.spring.tb.service.KioskService;

import lombok.AllArgsConstructor;

@RequestMapping("/tb/*")
@Controller
@AllArgsConstructor
public class KioskController {
	
	private KioskService service;
	
	@GetMapping("/getBurgerList")
	public void getBurgerList(Model model) {
		model.addAttribute("burger",service.getBurgerList());
	}
	
	@GetMapping("/getDrinkList")
	public void getDrinkList(Model model) {
		model.addAttribute("burger",service.getDrinkList());
	}
	
	@GetMapping("/getSideList")
	public void getSideList(Model model) {
		model.addAttribute("burger",service.getSideList());
	}

}
