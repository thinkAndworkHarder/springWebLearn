package com.jeb.springlearn.dynaProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor {

	public Object bind(Object target) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object enhancedObject, Method method, Object[] arguments, MethodProxy proxy) throws Throwable {
		System.out.println("方法执行前......");
		Object result = proxy.invokeSuper(enhancedObject, arguments);
		System.out.println("方法执行后......");
		return result;
	}

}
