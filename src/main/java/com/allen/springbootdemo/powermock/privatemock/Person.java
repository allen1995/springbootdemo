package com.allen.springbootdemo.powermock.privatemock;

/**
 * @Auther: allen
 * @Date: 2020-04-14 22:01
 * @Description:
 */
public class Person {
    private long id;

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
