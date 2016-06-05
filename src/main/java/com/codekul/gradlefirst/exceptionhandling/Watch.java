/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.exceptionhandling;

import java.util.concurrent.ExecutionException;

/**
 *
 * @author melayer
 */
public class Watch {

    public void someAlgo(int day) {

        try {
            int calc = 100 / day; // throw new ArithmaticException();

            System.out.println("Calculation prodeuced - " + calc);
        } 
        catch(ArithmeticException e){
            System.out.println("I am in catch - "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("I am in catch - "+e.getMessage());
        }
        catch(Throwable t){
            System.out.println("I am in catch of throeablr- "+t.getMessage());
        }
        
        System.out.println("I got executed :)");
    }
    
    public void whatsTheTime(int time) throws MyException,Exception{
        
        if(time > 10){
            throw new MyException();
        }
        else {
            System.out.println("Proper");
        }
    }
}
