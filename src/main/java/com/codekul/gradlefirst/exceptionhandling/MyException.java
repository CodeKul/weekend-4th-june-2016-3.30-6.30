/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.exceptionhandling;

/**
 *
 * @author melayer
 */
public class MyException extends Exception /**checked*/{

    @Override
    public String getMessage() {
        return super.getMessage() +" you aked me time rudely";
    }
}
