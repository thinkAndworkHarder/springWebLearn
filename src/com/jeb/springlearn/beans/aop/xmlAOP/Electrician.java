package com.jeb.springlearn.beans.aop.xmlAOP;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Electrician {

	public void lightOn() {
		System.err.println("����ǰ��֪ͨ======���򿪵ƹ�***********");
	}
	
	public void lightOff() {
		System.err.println("���Ǻ���֪ͨ======���رյƹ�***********");
	}
	
	public void compereSay() {
		System.out.println("��������֪ͨ======�������˽������**********");
	}
	
	public void validateWords(String words1, String words2) {
		if (words1.startsWith("T")) {
			System.out.println("̨����ȷ...");
		} else {
			System.out.println("̨������...");
		}
		
		if (words1.endsWith("?")) {
			System.out.println("̨���Ǹ��ʾ�...");
		} else {
			System.out.println("̨�ʲ����ʾ�...");
		}
	}
	
	public void computeTimeLength(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = new Date().getTime();
		System.out.println("��ʼʱ�䣺"+start);
		
		joinPoint.proceed();
		
		long end = new Date().getTime();
		System.out.println("����ʱ�䣺"+end);
		
		System.out.println("������ʱ��"+(end - start)+"ms");
	}
}
