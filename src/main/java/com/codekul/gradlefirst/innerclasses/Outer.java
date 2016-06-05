package com.codekul.gradlefirst.innerclasses;


public class Outer {
    // class inside(memory of outer) class is inner class
    
    public class NonStatic { // 1. non static inner class
        // Ouetr.class
        // Outer$NonStatic.class
        
    }
    
    public static class Static { // 2. static inner class
        
        // Outer$Static.class
    }
    
    public void myMethod(){ // 3. local inner class
        
        class LocalInner {
            
        }
    }
    
    private class MyClass implements MyInterface { // non static inner class
    // here you are create one named(MyClass) class which is
        // implementing MyInterface
        
        // Outer$MyClass.class
        @Override
        public void callMe() {
        }
    }
    
    private MyInterface my = new MyClass();
    private MyInterface our = new MyInterface() {
        // compiler will create one anonymus class and it will 
        // implement MyInterface to it
        @Override
        public void callMe() {
            // Outer$1.class
        }
    };
    
    private MyInterface lambda1 = () -> {  };
    private MyInterface lambda2 = () -> {  };
    private MyInterface lambda3 = () -> {  };
    private MyInterface lambda4 = () -> {  };
}


