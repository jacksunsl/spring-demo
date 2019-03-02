package com.hipishare.spring.sample.factory;

import com.hipishare.spring.sample.service.CombatService;
import com.hipishare.spring.sample.service.LoveService;
import com.hipishare.spring.sample.service.LoveServiceImpl;

public class LoveServiceFactory {

	public static LoveService getLoveServiceFromStaticFactoryMethod() {
		return new LoveServiceImpl();
	}

	public CombatService getCombatServiceFromMemberFactoryMethod(int time) {
		return new CombatService(time);
	}
}
