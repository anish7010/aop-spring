package com.training.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.model.Circle;
import com.training.model.Triangle;

public class CreateShape {
  private Circle circle;
  private Triangle triangle;
  
  public Circle getCircle() {
    return circle;
  }
  @Resource
  public void setCircle(Circle circle) {
    this.circle = circle;
  }
  public Triangle getTriangle() {
    return triangle;
  }
  @Resource
  public void setTriangle(Triangle triangle) {
    this.triangle = triangle;
  }
  
  public void display() {
    System.out.println(circle.getName()+","+triangle.getName());
  }
}
