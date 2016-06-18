/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.generics;

/**
 *
 * @author melayer
 */
public class Generics<T> {
    
    private T anyType;

    public T getAnyType() {
        return anyType;
    }

    public void setAnyType(T anyType) {
        this.anyType = anyType;
    }
}
