/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.infetrfaces;

/**
 *
 * @author melayer
 */
public class Human implements GpsListener{
    
    
    public void eat(){
        
    }

    @Override
    public String locate() {
        return "At Garden";
    }

    @Override
    public void listen() {
    }

    @Override
    public void stillListening() {
    }
}
