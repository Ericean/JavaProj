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
public class SingletonDemo {
    public static void main(String[] args) {
       //Comipler error SingleObj so=new SingleObj();
       SingleObj so=SingleObj.getInstance();
       so.hi();
    }
}
