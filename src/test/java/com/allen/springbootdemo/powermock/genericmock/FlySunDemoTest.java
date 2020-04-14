package com.allen.springbootdemo.powermock.genericmock;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import java.io.File;

/**
 * @Auther: allen
 * @Date: 2020-04-14 21:17
 * @Description: 普通Mock： Mock参数传递的对象
 */
public class FlySunDemoTest {

    @Test
    public void callArgumentInstanceTest(){
        File file = PowerMockito.mock(File.class);
        FlySunDemo demo = new FlySunDemo();

        PowerMockito.when(file.exists()).thenReturn(true);
        Assert.assertTrue(demo.callArgumentInstance(file));

    }
}
