package com.jeb.springlearn.beans.aop.annotationAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AddServiceAspect {

	@DeclareParents(value="com.jeb.springlearn.beans.aop.annotationAOP.Boss",
			defaultImpl=FlyImpl.class)
	private Fly fly;
	
}
