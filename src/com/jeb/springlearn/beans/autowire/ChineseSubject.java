package com.jeb.springlearn.beans.autowire;

import com.jeb.springlearn.beans.autowire.qualifiers.ChinaSubj;

@ChinaSubj
public class ChineseSubject extends Subject {

	public ChineseSubject() {}
	
	public ChineseSubject(String name) {
		setName(name);
	}
}
