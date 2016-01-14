package com.jeb.springlearn.beans.autowire;

public abstract class Subject {

	private String name;

	public Subject() {}
	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
