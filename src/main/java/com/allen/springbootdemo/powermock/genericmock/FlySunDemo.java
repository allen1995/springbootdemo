package com.allen.springbootdemo.powermock.genericmock;

import java.io.File;

/**
 * 普通Mock： Mock参数传递的对象
 */
public class FlySunDemo {
    public boolean callArgumentInstance(File file) {
        System.out.println("test");
        return file.exists();
    }  
}  