package com.tiru.springtest.SpringTest.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect()
public class DescripberAspect {
	
	@Around("execution(public * get*())")
	public Object TestAdvice(ProceedingJoinPoint joinpoints) {
		Object i=0;
		try {
			 i = joinpoints.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is a class "+joinpoints.getTarget().getClass().getSimpleName());
		return i;
	}
	
	@AfterReturning(pointcut="AllGetters()",returning="ReturnString")
	public void TestAdvice2(Object ReturnString) {
		System.out.println("This is a test Advice2 with return object as "+ReturnString);
	}
	
	
	@Pointcut("execution(public * get*())")
	public void AllGetters() {
		System.out.println("This is a test Advice");
	}
	
	@After("@annotation(com.tiru.springtest.SpringTest.Annotation.CustomAnnotation)")
	public void CustomeAnnotateAdvice() {
		System.out.println("Custom Annotation");
	}

}
