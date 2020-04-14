package com.allen.springbootdemo.powermock.staticmock;

public class FlySunDemo {
    public boolean callStaticMethod() {  
        return ClassDependency.isAlive();  
    }  
} 