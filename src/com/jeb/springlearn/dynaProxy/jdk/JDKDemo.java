package com.jeb.springlearn.dynaProxy.jdk;

public class JDKDemo {

	public static void main(String[] args) {
		MyHandler handler = new MyHandler();
		Climb target = new ClimbImpl();
		Climb climb = (Climb) handler.getProxy(target);
		climb.climb();
	}
}
