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
public class SingleObj {
    
    private static SingleObj so=new SingleObj();
    private SingleObj(){}
    public static SingleObj getInstance(){
        return so;
    }
    public void hi(){
        System.out.println("com.tc.oo.creational.SingleObj.hi()");
    }
    public static void main(String[] args) {
        //still ok inside the class
        SingleObj so=new SingleObj();
        so.hi();
    }
}
