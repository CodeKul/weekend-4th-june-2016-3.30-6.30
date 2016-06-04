/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.staticnonstatic;

/**
 *
 * @author melayer
 */

// javac KeyBoard.java -> KeyBoard.class
// java KeyBoard
public class KeyBoard {
    
    private static int numLock ;
    private int capsLock ;

    static {
        numLock = 1;
    }
    
    public KeyBoard() {
        capsLock = 1;
    }
    
    public int howManyKeysAreThere(String brand){
        numLock = 10;
        return brand.equals("dell") ? 127 : 107;
    }
    
    public static void whatIsKeyBoard(){
        numLock = 1;
        
        System.out.println("keyboard is box with a to z keys");
    }
}
