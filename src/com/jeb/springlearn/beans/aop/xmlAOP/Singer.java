package com.jeb.springlearn.beans.aop.xmlAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Singer {

	public void sing() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("singing song...");
	}
	
	public void sayWords(String words1, String words2) {
		System.out.println("speak "+words1+words2+"...");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Singer singer = (Singer) context.getBean("singer");
		singer.sing();
//		singer.sayWords("this words is right", "?");
		Swim swim = (Swim) singer;
		swim.simming();
	}
}
