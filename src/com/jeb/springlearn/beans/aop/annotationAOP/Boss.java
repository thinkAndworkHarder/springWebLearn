package com.jeb.springlearn.beans.aop.annotationAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Boss {

	public void meeting() throws InterruptedException {
		System.out.println("ÀÏ°å¿ª»á...");
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Boss boss = (Boss) context.getBean("boss");
		boss.meeting();
		
		Fly fly = (Fly) boss;
		fly.fly();
		
		System.out.println("boss == fly ?" + (boss == fly ?true:false));
	}
}
