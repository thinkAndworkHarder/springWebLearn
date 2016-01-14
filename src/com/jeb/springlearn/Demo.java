package com.jeb.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeb.springlearn.beans.Fork;
import com.jeb.springlearn.beans.Knife;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Knife knife = (Knife) context.getBean("knife");
		Knife knife2 = (Knife) context.getBean("knifeWithLength");
		System.out.println(knife == knife2);
//		knife.useTool();
		
		Fork fork = (Fork) context.getBean("fork");
		Fork fork2 = (Fork) context.getBean("fork");
		System.out.println(fork == fork2);
//		fork.useTool();
		
//		Person person = (Person) context.getBean("person");
//		System.out.println(person);
//		person.getTool().useTool();
	}
}
