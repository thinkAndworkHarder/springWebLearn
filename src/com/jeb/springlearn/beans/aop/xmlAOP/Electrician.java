package com.jeb.springlearn.beans.aop.xmlAOP;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Electrician {

	public void lightOn() {
		System.err.println("我是前置通知======》打开灯光***********");
	}
	
	public void lightOff() {
		System.err.println("我是后置通知======》关闭灯光***********");
	}
	
	public void compereSay() {
		System.out.println("我是例外通知======》主持人解决问题**********");
	}
	
	public void validateWords(String words1, String words2) {
		if (words1.startsWith("T")) {
			System.out.println("台词正确...");
		} else {
			System.out.println("台词有误...");
		}
		
		if (words1.endsWith("?")) {
			System.out.println("台词是个问句...");
		} else {
			System.out.println("台词不是问句...");
		}
	}
	
	public void computeTimeLength(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = new Date().getTime();
		System.out.println("开始时间："+start);
		
		joinPoint.proceed();
		
		long end = new Date().getTime();
		System.out.println("结束时间："+end);
		
		System.out.println("唱歌用时："+(end - start)+"ms");
	}
}
