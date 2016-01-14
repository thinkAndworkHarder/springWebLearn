package com.jeb.springlearn.beans.autowire;

import org.springframework.beans.factory.annotation.Value;

/**
 * 班级类
 * @author Administrator
 *
 */
public class Clazz {

	private String name;

	public String getName() {
		return name;
	}

	@Value(value="高三一班")
	public void setName(String name) {
		this.name = name;
	}

	public Clazz(String name) {
		this.name = name;
	}

	public Clazz() {}
	
}
