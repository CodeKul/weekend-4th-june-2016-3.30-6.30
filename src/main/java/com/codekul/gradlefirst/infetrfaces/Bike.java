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
public class Bike implements GpsListener{
    
    public void speedUp(){
        
    }

    @Override
    public String locate() {
        return "on Road";
    }

    @Override
    public void listen() {
    }

    @Override
    public void stillListening() {
    }
}
