package com.sikdorak.spring.tb.mapper;

import java.util.List;

import com.sikdorak.spring.tb.dto.KioskDto;

public interface KioskMapper {
	public List<KioskDto>getBurgerList();
	public List<KioskDto>getDrinkList();
	public List<KioskDto>getSideList();

}
