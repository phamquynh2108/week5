/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Administrator
 */
public class Square extends Rectangle {
      private double size;

    public Square(){

    }

    public Square(double size){
        this.size = size;
    }

    public Square(double size, String color, boolean filled,double width, double length){
        super(width, length, color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

      @Override
    public void setWidth(double size){
        setWidth(size);
    }

      @Override
    public void setLength(double size){
        setLength(size);
    }

      @Override
    public  String toString(){
        return "Square:" + "" + this.size+" "+ getArea()+" "+getPerimeter();
    }
    
    
}
