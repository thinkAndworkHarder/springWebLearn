package com.jeb.springlearn.dynaProxy.cglib;

public class CglibDemo {

	public static void main(String[] args) {
		MyInterceptor interceptor = new MyInterceptor();
		PlayBasketball playBasketball = (PlayBasketball) interceptor.bind(new PlayBasketball());
		playBasketball.play();
	}
}
