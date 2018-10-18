/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Pham Quynh
 */
public class Circle extends Shape{
    double radius;
    final double Pi = 3.1415926535897;
    public Circle(){
        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Pi;
    }
    public double getPerimeter(){
        return radius*2*this.Pi;
    }
    public String toString(){
        return "Circle"+getColor()+" "+ radius + " " + getArea()+ " " +getPerimeter();
    }
}

