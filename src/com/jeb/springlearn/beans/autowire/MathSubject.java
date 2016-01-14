package com.jeb.springlearn.beans.autowire;

import org.springframework.stereotype.Component;

//@Component("mymathSubject")
public class MathSubject extends Subject {
	public MathSubject() {setName("我的数学");}
	public MathSubject(String name) {
//		setName(name);
		setName("我的数学"+name);
	}
}
