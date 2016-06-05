/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.abstractclasses;

/**
 *
 * @author melayer
 */
public /*or make it abstract*/ class Tiger extends Animal  { 
    
    // java does not need multiple parents
    
    @Override // either provide implementation to all abstract methods
    public void run() {
        System.out.println("Tiger is running");
    }
}
