package com.allen.springbootdemo.powermock.finalmock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @Auther: allen
 * @Date: 2020-04-14 21:39
 * @Description:
 */
@RunWith(PowerMockRunner.class)
public class FlySunDemoTest {

    @PrepareForTest(ClassDependency.class)
    @Test
    public void callFinalMethodTest(){

        ClassDependency refer = PowerMockito.mock(ClassDependency.class);

        PowerMockito.when(refer.isAlive()).thenReturn(true);

        FlySunDemo demo = new FlySunDemo();
        Assert.assertTrue(demo.callFinalMethod(refer));
    }
}
