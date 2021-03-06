package com.min.doc.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.min.doc.dao.WeatherDAO;
import com.min.doc.dto.WeatherVO;


@Service
public class WeatherServiceImpl implements WeatherService {
	    
	 @Inject
	 private WeatherDAO dao;
	    
	/*
	 * @Override public WeatherVO weatherDao(String tem, String hum){
	 * 
	 * return dao.weatherDao(tem, hum); }
	 */
	    
	    @Override
	    public List<WeatherVO> weatherDao(@Param("tem")String tem){
	    	logger.info("service");
	    	logger.info("tem:" + tem);
	        return dao.weatherDao(tem);
	    }
	    
	    
}
