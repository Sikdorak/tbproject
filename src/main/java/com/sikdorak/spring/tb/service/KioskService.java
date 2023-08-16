package com.sikdorak.spring.tb.service;

import java.util.List;

import com.sikdorak.spring.tb.dto.KioskDto;

public interface KioskService {
	public List<KioskDto>getBurgerList();
	public List<KioskDto>getDrinkList();
	public List<KioskDto>getSideList();
}
