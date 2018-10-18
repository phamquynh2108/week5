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
public class Rectangle extends Shape {
    double width = 1.0d;
    double length = 1.0d;

    public Rectangle() {
        
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public  double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)/2;
    }
    @Override
    public String toString(){
        return "Rectangle"+getLength()+" "+getWidth()+" "+getArea()+" "+getPerimeter();
    }
    
    
}
