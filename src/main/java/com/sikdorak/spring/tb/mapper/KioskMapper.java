package com.sikdorak.spring.tb.mapper;

import java.util.List;

import com.sikdorak.spring.tb.dto.KioskDto;

public interface KioskMapper {
	public List<KioskDto>getBurgerList();
	public List<KioskDto>getDrinkList();
	public List<KioskDto>getSideList();
	public void updateBurger(KioskDto kioskDto);
	public void updateDrink(KioskDto kioskDto);
	public void updateSide(KioskDto kioskDto);
	public List<KioskDto>getMenuList();
}
