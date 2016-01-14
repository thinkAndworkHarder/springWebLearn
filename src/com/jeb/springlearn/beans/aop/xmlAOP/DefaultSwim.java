package com.jeb.springlearn.beans.aop.xmlAOP;

import org.springframework.stereotype.Component;

@Component
public class DefaultSwim implements Swim {

	@Override
	public void simming() {
		System.out.println("我会游泳，嘿，我会游泳了");
	}

}
