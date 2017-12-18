package com.jnmd.liuwan.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.liuwan.domain.Hotel;
import com.jnmd.liuwan.mapper.HotelMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class HotelService{
	@Resource
	private HotelMapper hotelMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Hotel> getHotels(){
		return hotelMapper.getHotels();
	}
	
}
