package com.jeb.springlearn.beans.autowire;

import org.springframework.stereotype.Component;

//@Component("mymathSubject")
public class MathSubject extends Subject {
	public MathSubject() {setName("�ҵ���ѧ");}
	public MathSubject(String name) {
//		setName(name);
		setName("�ҵ���ѧ"+name);
	}
}
