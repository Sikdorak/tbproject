package com.sikdorak.spring.tb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikdorak.spring.tb.dto.KioskDto;
import com.sikdorak.spring.tb.mapper.KioskMapper;

import lombok.Setter;

@Service
public class KioskServiceImpl implements KioskService {
	
	@Setter(onMethod_ = @Autowired)
	private KioskMapper mapper;
	
	@Override
	public List<KioskDto> getBurgerList(){
		return mapper.getBurgerList();
	}
	
	@Override
	public List<KioskDto> getDrinkList(){
		return mapper.getDrinkList();
	}
	
	@Override
	public List<KioskDto> getSideList(){
		return mapper.getSideList();
	}
	
	@Override
	public void updateBurger(String p_id,String p_name,int p_price) {
		mapper.updateBurger(p_id,p_name,p_price);
	}

}
