package com.training;

import java.awt.Shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.service.CreateShape;

public class Main {
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    CreateShape shape = (CreateShape)context.getBean("createshape");
    shape.display();
  }
}
