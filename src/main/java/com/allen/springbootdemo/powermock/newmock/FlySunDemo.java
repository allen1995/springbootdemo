package com.allen.springbootdemo.powermock.newmock;

import java.io.File;

/**
 *  Mock方法内部new出来的对象
 */
public class FlySunDemo {
    public boolean callArgumentInstance(String path) {  
        File file = new File(path);
        return file.exists();  
    }  
}  