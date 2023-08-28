package com.sikdorak.spring.tb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sikdorak.spring.tb.dto.ProductDtoList;
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
		model.addAttribute("drink",service.getDrinkList());
	}
	
	@GetMapping("/getSideList")
	public void getSideList(Model model) {
		model.addAttribute("side",service.getSideList());
	}
	
//	@GetMapping("/addCart")
//	public String addCart(ProductDto product, HttpSession session) {
//		List<ProductDto> cartItems = (List<ProductDto>) session.getAttribute("cartItems");
//		
//		if(cartItems == null) {
//			cartItems = new ArrayList<>();
//		}
//		
//		cartItems.add(product);
//		session.setAttribute("cartItems", cartItems);
//		
//		return "redirect:/tb/cartList";
//	}
//	
//	@GetMapping("cartList")
//	public void cartList(HttpSession session, Model model) {
//		List<ProductDto> cartItems = (List<ProductDto>) session.getAttribute("cartItems");
//		model.addAttribute("cartItems", cartItems);
//	}

}
