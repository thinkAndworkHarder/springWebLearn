package com.jeb.springlearn.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TV implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("�رյ���");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("�򿪵���");
	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean("tv");
		context.destroy();
	}
}
