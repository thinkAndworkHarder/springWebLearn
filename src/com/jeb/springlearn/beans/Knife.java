package com.jeb.springlearn.beans;

import com.jeb.springlearn.Tool;

public class Knife implements Tool {

	private int length;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void useTool() {
		System.out.println("use "+this.name+" whose length is"+this.length+"cm knife...");
	}

	public Knife(int length, String name) {
		this.length = length;
		this.name = name;
	}
	
	public Knife() {};

}
