package com.sikdorak.spring.tb.service;

import java.util.List;

import com.sikdorak.spring.tb.dto.KioskDto;
import com.sikdorak.spring.tb.dto.ProductDtoList;

public interface KioskService {
	public List<KioskDto>getBurgerList();
	public List<KioskDto>getDrinkList();
	public List<KioskDto>getSideList();
	public void updateBurger(KioskDto kioskDto);
	public ProductDtoList getMenuList();
}
