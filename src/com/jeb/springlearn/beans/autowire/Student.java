package com.jeb.springlearn.beans.autowire;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeb.springlearn.beans.autowire.qualifiers.ChinaSubj;

public class Student {

	private String name;
//	@Autowired
//	@Qualifier("chineseSubject")
//	@ChinaSubj
	@Inject
	@Named("mathSubject")
	private Subject subject;
	
	public Student() {}
	public Student(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	@Value(value="#{myProperties['time']}")
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
//	@Inject
//	@Autowired(required=false)
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("Student's name is "+student.getName());
		if (student.getSubject() != null) {
			System.out.println("Subject's name is "+student.getSubject().getName());
		} else {
			System.out.println("Subject's name is null");
		}
	}
}
