package com.allen.springbootdemo.powermock.finalmock;

/**
 * Mock普通对象的final方法
 */
public class FlySunDemo {
    public boolean callFinalMethod(ClassDependency refer) {  
        return refer.isAlive();  
    }  
}  