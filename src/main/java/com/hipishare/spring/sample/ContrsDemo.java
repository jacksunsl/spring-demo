package com.hipishare.spring.sample;

import com.hipishare.spring.sample.config.BeanE;
import com.hipishare.spring.sample.config.BeanF;

public class ContrsDemo {

	private int age;

	private String name;

	private BeanE be;

	private BeanF bf;

	public ContrsDemo(int age, String name, BeanE be, BeanF bf) {
		super();
		this.age = age;
		this.name = name;
		this.be = be;
		this.bf = bf;
	}

	public ContrsDemo(String name, BeanE be, BeanF bf) {
		super();
		this.name = name;
		this.be = be;
		this.bf = bf;
	}

	public ContrsDemo(BeanE be, BeanF bf) {
		super();
		this.be = be;
		this.bf = bf;
	}

}
