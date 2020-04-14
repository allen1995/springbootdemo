package com.allen.springbootdemo.powermock.staticmock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @Auther: allen
 * @Date: 2020-04-14 21:45
 * @Description:
 */
@RunWith(PowerMockRunner.class)
public class FlySunDemoTest {

    @PrepareForTest(ClassDependency.class)
    @Test
    public void callStaticMethod(){
        PowerMockito.mockStatic(ClassDependency.class);

        PowerMockito.when(ClassDependency.isAlive()).thenReturn(true);
        FlySunDemo demo = new FlySunDemo();
        Assert.assertTrue(demo.callStaticMethod());
    }


}
