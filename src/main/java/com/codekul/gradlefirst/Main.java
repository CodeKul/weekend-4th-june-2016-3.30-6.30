/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst;

import com.codekul.gradlefirst.langbasics.LangBasics;
import com.codekul.gradlefirst.staticnonstatic.KeyBoard;

/**
 *
 * @author melayer
 */
public class Main {

    /**
     * Registers the text to display in a tool tip. The text displays when the
     * cursor lingers over the component.
     *
     * @param args these are command line arguments
     *  
     */
    public static void main(String[] args) {
        
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
}
