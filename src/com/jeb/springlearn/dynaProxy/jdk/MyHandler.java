package com.jeb.springlearn.dynaProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHandler implements InvocationHandler {

	private Object target;
	
	public Object getProxy(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法执行前......");
		Object result = method.invoke(target, args);
		System.out.println("方法执行后......");
		return result;
	}
}
