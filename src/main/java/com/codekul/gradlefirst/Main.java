/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst;

import com.codekul.gradlefirst.abstractclasses.Animal;
import com.codekul.gradlefirst.abstractclasses.Tiger;
import com.codekul.gradlefirst.exceptionhandling.Watch;
import com.codekul.gradlefirst.infetrfaces.Bike;
import com.codekul.gradlefirst.infetrfaces.GpsListener;
import com.codekul.gradlefirst.infetrfaces.Human;
import com.codekul.gradlefirst.inheritance.Bmw;
import com.codekul.gradlefirst.inheritance.Car;
import com.codekul.gradlefirst.innerclasses.Outer;
import com.codekul.gradlefirst.langbasics.LangBasics;
import com.codekul.gradlefirst.staticnonstatic.KeyBoard;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melayer
 */
public class Main {

    /**
     * 
     * I will write description later on ...
     *
     * @param args these are command line arguments
     *   
     */
    public static void main(String[] args/* command line arguments */) { // java Main 10 20 30 -> Main.main({});
       
        exceptionHandling();
    }
    
    public static void languageBasics(){
        
        int i =  10;
        
        // javac and java // WORA - Write Once Read Anywhere 
        // strictly typed lang
        LangBasics pqr = new LangBasics();
        pqr.showLagAge(); // late binding or runtime binding 
        pqr.showLagAge(10);
        pqr.showLagAge(10d);
        
        LangBasics lang = new LangBasics(10);
        lang.showLagAge();
        
        KeyBoard board = new KeyBoard();
        int keys = board.howManyKeysAreThere("lenevo");
        
        KeyBoard.whatIsKeyBoard();
    }
    
    public static void inheritance(){
        
        Bmw bmw = new Bmw();
        bmw.setCarName("BMW");
        bmw.setWheel(10);
        
       //int speed = bmw.speedUp();
        
        //System.out.println("Speed is- "+speed);
        
        Car car = new Car();
        
        Car carBmw = new Bmw(); // bmw = car + bmw
        //carBmw.enableCruzeControl();
        carBmw.speedUp();
                
        
        //Bmw car = new Car(); // bcz of enhancements in bmw it is not allowed
      
    }
    
    public static void abstractClasses(){
        
        //Animal animal = new Animal(); // object of abstarct class is not allowed
        
        Tiger tiger = new Tiger();
        tiger.run();
        
        Animal animalTiger = new Tiger();
        animalTiger.run();
    }
    
    public static void interfaces(){

        Human human = new Human();
        System.out.println("Human is at - "+human.locate());
        
        Bike bike = new Bike();
        System.out.println("Bike is at - "+bike.locate());
        
        GpsListener gpsHuman = new Human();
        System.out.println("Gps Human is at - "+gpsHuman.locate());;
                
    }
    
    public static void innerClasses(){
        
        Outer outer = new Outer();
        Outer.NonStatic notStatic = outer.new NonStatic();
        
        Outer.Static innerStatic = new Outer.Static();
        outer.myMethod();
    }
    
    public static void exceptionHandling(){
        
        Watch watch = new Watch();
        watch.someAlgo(15);
        watch.someAlgo(150);
        watch.someAlgo(56);
        watch.someAlgo(0);
        
        try {
            watch.whatsTheTime(5);
        } catch (Exception ex) {
            System.out.println(""+ex.getMessage());
        }
    }
}
