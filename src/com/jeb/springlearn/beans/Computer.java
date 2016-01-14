package com.jeb.springlearn.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Computer {

	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void startUp() {
		System.out.println("��������");
	}
	
	public void shutDown() {
		System.out.println("�رյ���");
	}
	
	@Override
	public String toString() {
		return brand+"����";
	}
	
	public Computer(String brand) {
		this.brand = brand;
	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer computer = (Computer) context.getBean("computer");
		System.out.println(computer);
		context.destroy();
	}
}
