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

// bmw is a car
public class Car {
    
    private String carName; // containment
    private String country;
    private Integer version;
    private Integer wheel;
    protected  int horn;
    
    private Engine engine; //containment 

    public Car() {
        
        carName = "";
        country = "";
        version = 1;
        wheel = 4;
        engine = new Engine();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
    public int speedUp(){
        
        System.out.println("From car class");
        return   wheel * 10;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }
    
    
}
