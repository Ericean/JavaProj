/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.oo.creational;

/**
 *
 * @author Ze
 */
public class ShapeFactory  extends AbstractFactory{
 
    public Shape getShape(String shape){
        if(shape==null)return null;
        if(shape.contentEquals("Circle"))return new Circle();
        else if(shape.contentEquals("Square"))return new Square();
        else if(shape.contentEquals("Rectangle"))return new Rectangle();
        else return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
    
//    public static void main(String[] args) {
//        ShapeFactory sf=new ShapeFactory();
//        Shape sp=sf.getShape("Rectangle");
//        sp.draw();
//    }
}
