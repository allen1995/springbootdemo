package com.allen.springbootdemo.powermock.privatemock;

/**
 *  Mock 私有方法
 */
public class FlySunDemo {
    public boolean callPrivateMethod(Person person) {
        System.out.println(person.getId());
        return isAlive(person);
    }  
  
    private boolean isAlive(Person person) {
        System.out.println("this is isAlive.");
        System.out.println(person.getId());
        System.out.println("this is isAlive end.");
        return true;
    }  
}