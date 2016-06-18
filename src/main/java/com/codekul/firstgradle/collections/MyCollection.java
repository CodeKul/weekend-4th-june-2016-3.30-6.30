/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstgradle.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author melayer
 */
public class MyCollection {
    
    public void whatIsCollection(){
        
        Collection<String> collection = 
                new ArrayList<>();
        
        collection.add("India");
        collection.add("China");
        collection.add("Japan");
        collection.add("Shri Lanka");
        
        // this is collection
    }
    
    public void howShouldIFetchElementsOfCollection(){
        
        Collection<String> collection = 
                new ArrayList<>();
        
        collection.add("India");
        collection.add("China");
        collection.add("Japan");
        collection.add("Shri Lanka");
        
        // here are the ways of iteration 
        /* 1. */ for(int i = 0; i < collection.size() ;i++){
            
            // collection can not give u element @ ith location
        }
        
        /* 2. foreach */ for(String country : collection){
            
            System.out.println("Foreach - "+country);
        }
        
        /* 3. Iterator */ Iterator<String> iterator = 
                collection.iterator();
        
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("Iterator - "+element);
        }
        
        /* 4. java 8s foreach using lambda*/
        
        collection
                .forEach(country -> System.out.println(" "+country));
    }
    
    public void whoAreTheCollections(){
        
        Collection<String> collList = 
                new ArrayList<>(); // list
        collList.size();
        
        Collection<String> collSet = 
                new TreeSet<>(); //set
        
        Collection<String> collVector = 
                new Vector<String>(); //deque
        
        acceptAnyCollection(new TreeSet<>());
        acceptAnyCollection(new ArrayList<>());
        acceptAnyCollection(new Vector<>());
    }
    
    public void acceptAnyCollection(Collection<String> anyCollection){
        
    }
    
    public void whatIsList(){
        
        ArrayList<String> listString = 
                new ArrayList<>();
        
        listString.add("India");
        listString.add("China");
        listString.add("Japan");
        listString.add("Japan");
        listString.add(null);
        
        for(String country : listString){
            System.out.println(""+country);
        }
        
        String india = listString.get(0);
    }
    
    public void whatAboutSet(){
        
        HashSet<String> hashSet = 
                new HashSet<>();
        hashSet.add("India");
        hashSet.add("India");
        hashSet.add("China");
        hashSet.add("Japan");
        hashSet.add(null);
        
        for(String country : hashSet){
            System.out.println(""+country);
        }
        
         hashSet.remove("China");
         System.out.println("------------------");
         for(String country : hashSet){
            System.out.println(""+country);
        }
    }
    
    public void whatIsSortedSet(){
        
        TreeSet<Integer> treeInt = 
                new TreeSet<>();
        
        treeInt.add(45);
        treeInt.add(1);
        treeInt.add(99);
        treeInt.add(4);
        treeInt.add(21);
        treeInt.add(5);
        
        for(Integer i : treeInt){
            
            System.out.println(" "+i);
        }
    }
    
    public void howDoIUseMap(){
        
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "India");
        map.put(2, "India");
        map.put(3, "China");
        map.put(3, "China");
        map.put(4, null);
        
        String india = map.get(1);
        System.out.println("1st Location "+india);
        
        Collection<String> values =
                map.values();
        
        for(String val : values){
            System.out.println("Value - "+val);
        }
        
        Set<Integer> keys = 
                map.keySet();
        
        for(Integer key : keys){
            System.out.println("Key - "+key);
        }
    }
}
