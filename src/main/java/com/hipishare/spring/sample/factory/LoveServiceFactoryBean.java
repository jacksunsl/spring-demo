package com.hipishare.spring.sample.factory;

import org.springframework.beans.factory.FactoryBean;

import com.hipishare.spring.sample.service.LoveService;
import com.hipishare.spring.sample.service.LoveServiceImpl;


public class LoveServiceFactoryBean implements FactoryBean<LoveService> {

	@Override
	public LoveService getObject() throws Exception {
		return new LoveServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return LoveService.class;
	}

}
