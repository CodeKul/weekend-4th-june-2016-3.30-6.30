/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.gradlefirst.langbasics;

/**
 *
 * @author melayer
 */
//<access modifier> <keyword> <name-of-class>
public class LangBasics {
    
    private int lagAge; //state 

    public LangBasics() { // special typr of method, 
        //who will not have return type and name is same as class
        lagAge = 0;
    }
    
     public LangBasics(int age) { // special typr of method, 
        //who will not have return type and name is same as class
        lagAge = age;
    }
    
    /*over loading*/
    public void showLagAge(){ // behaviour
        
        System.out.println("Age is "+lagAge);
    }
    
     public void showLagAge(int year){ // behaviour
        
         lagAge = year * 2;
         
        System.out.println("Age is "+lagAge);
    }
     
     public int showLagAge(double year){ // behaviour
        
         lagAge = (int)year * 2;
         
        System.out.println("Age is "+lagAge);
        
        return lagAge;
    }
     
     public void howIfWorks(){
         
         if(lagAge > 3 ){
             System.out.println("it is good");
         }
         else if(lagAge > 3 && lagAge <= 10){
             System.out.println("it is also good");
         }
         else if(lagAge > 10 && lagAge < 20){
             System.out.println("it is best");
         }
         else {
             System.out.println("it is java");
         }
     }
     
     public void howForLoopWorks(){
         
         for(int i = 1; i <= 10; i++){
             System.out.println(""+ (i*2)); // string + anything is always string
             System.out.println(""+10+10); //1010
             System.out.println(""+(10+10)); //20
         }
     }
     
     public void isThereWhileLoop(){
         
         int i = 1;
         while(i <= 10) {
             System.out.println(""+(i*2));
         }
     }
     
     public void howShouldiWriteArrays(){
         
         int []arr = new int[10];
         
         for(int i = 0; i < arr.length; i++){
             System.out.println(""+arr[i]);
         }
         
        int []otherArray = {10,20,30,50};
        
        for(int el : otherArray){
            System.out.println(""+el);
        }
     }
}

class LangBasics1 {
    
}
