package com.sikdorak.spring.tb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sikdorak.spring.tb.dto.KioskDto;

@Service
public class KioskServiceImpl implements KioskService {
	
	@Override
	
	public List<KioskDto> getBurgerList(){
		ArrayList<KioskDto> burgerList = new ArrayList<>();
		burgerList.add(new KioskDto("h1","치즈버거",10000));
		return burgerList;
	}

}
