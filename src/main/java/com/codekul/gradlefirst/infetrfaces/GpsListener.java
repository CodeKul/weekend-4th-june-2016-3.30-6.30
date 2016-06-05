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
// is lightweight abstract class
public /*abstract*/ interface GpsListener extends OtherListener,YetOtherListener{
    // 1. one interface can extend one or more interfaces
    // 2. one interface can never implement other interface
    // 3. one class can implement one or more interfaces
    // 4. one class can extends one class only
    
    
    public static final int I_AM_CONSTANT = 10;
    
    /*public abstract*/ String locate();
}

interface OtherListener {
    
    void listen();
}

interface YetOtherListener {
    
    void stillListening();
}
