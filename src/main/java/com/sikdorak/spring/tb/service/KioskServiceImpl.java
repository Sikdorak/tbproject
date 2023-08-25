package com.sikdorak.spring.tb.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikdorak.spring.tb.dto.KioskDto;
import com.sikdorak.spring.tb.mapper.KioskMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
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
	public void updateBurger(KioskDto kioskDto) {
		log.info("============"+kioskDto);
		mapper.updateBurger(kioskDto);
	}
	
	@Override
	public List<KioskDto>getMenuList(){
		ArrayList<KioskDto> x = (ArrayList<KioskDto>) mapper.getMenuList();
		log.info("============"+x.get(0).getP_id());
		return x;
	}

}
