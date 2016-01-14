package com.jeb.springlearn.beans.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Teacher {

//	@Value(value="ÕÅÈý")
	private String name;
	
//	@Autowired(required=false)
	private Clazz clazz;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired(required=false)
	public Teacher(Clazz clazz) {
		this.clazz = clazz;
	}
	public Teacher(String name, Clazz clazz) {
		this.name = name;
		this.clazz = clazz;
	}
	public Clazz getClazz() {
		return clazz;
	}

//	@Autowired
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

//	@Autowired
	public void sayHello(Clazz clazz) {
		this.clazz = clazz;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher2 = (Teacher) context.getBean("teacher");
		System.out.println("teacherName:" + teacher2.getName());
		System.out.println("teacher2ClazzName:" + teacher2.getClazz().getName());
	}
}
