package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
	
	// This method has to run on a call of something else 
	// (before getName() method of Circle class):
	@Before("execution(public String com.demo.model.Circle.getName())")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get method called.");
	}
}
