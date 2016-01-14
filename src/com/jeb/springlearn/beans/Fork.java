package com.jeb.springlearn.beans;

import com.jeb.springlearn.Tool;

public class Fork implements Tool {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void useTool() {
		System.out.println("use fork whose name is "+name+"...");
	}

	private Fork(String name) {
		this.name = name;
	}
	
	public static Fork getInstance() {
		return new Fork("²æ×Ó");
	}
}
