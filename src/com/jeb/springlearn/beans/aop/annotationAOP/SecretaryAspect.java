package com.jeb.springlearn.beans.aop.annotationAOP;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecretaryAspect {

	@Pointcut("execution(* com.jeb.springlearn.beans.aop.annotationAOP.Boss.meeting(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void beforeMeeting() {
		System.out.println("秘书整理好文件...");
	}
	
	@AfterReturning("pointcut()")
	public void afterMeeting() {
		System.out.println("秘书负责整理会议内容...");
	}
	
	@Around("pointcut()")
	public void aroundMeeting(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("会议开始时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		joinPoint.proceed();
		System.out.println("会议结束时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
