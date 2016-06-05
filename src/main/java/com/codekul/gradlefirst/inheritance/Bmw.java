/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.inheritance;

/**
 *
 * @author melayer
 */


public class Bmw /*Bmw is a Car*/ extends Car{
    
    private int airSuspension = 1;
    
    public void enableCruzeControl(){

        horn = 10;
        setCarName("BMW");
        
        System.out.println(""+getCarName());
    }

    @Override // annotation
    public int speedUp() {
        System.out.println("from bmw");
        return  super.speedUp() + (getWheel() * airSuspension * 2);
    }
}
