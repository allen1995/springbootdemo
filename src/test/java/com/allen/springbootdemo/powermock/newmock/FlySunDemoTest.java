package com.allen.springbootdemo.powermock.newmock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.stubbing.OngoingStubbing;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

/**
 * @Auther: allen
 * @Date: 2020-04-14 21:28
 * @Description:  Mock方法内部new出来的对象
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(FlySunDemo.class)
public class FlySunDemoTest {

    @Test
    public void callArgumentInstanceTest(){
        File file = PowerMockito.mock(File.class);

        try {
            PowerMockito.whenNew(File.class).withArguments("bbb").thenReturn(file);

            FlySunDemo demo = new FlySunDemo();
            PowerMockito.when(file.exists()).thenReturn(true);
            Assert.assertTrue(demo.callArgumentInstance("bbb"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
