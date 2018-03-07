package com.training;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
  
  @Before("execution(public void display())")
  public void show() {
    System.out.println("Aspect method");
  }
}
