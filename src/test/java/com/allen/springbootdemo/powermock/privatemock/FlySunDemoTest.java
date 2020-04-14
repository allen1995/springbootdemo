package com.allen.springbootdemo.powermock.privatemock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

/**
 * @Auther: allen
 * @Date: 2020-04-14 21:51
 * @Description:  Mock 私有方法
 */
@RunWith(PowerMockRunner.class)
public class FlySunDemoTest {

    @Test
    @PrepareForTest(FlySunDemo.class)
    public void callPrivateMethodTest() throws Exception {
        FlySunDemo demo = PowerMockito.mock(FlySunDemo.class);

        Person person = new Person(12L);

        PowerMockito.when(demo.callPrivateMethod(person)).thenCallRealMethod();
        PowerMockito.when(demo, "isAlive", person ).thenCallRealMethod();

        Assert.assertTrue(demo.callPrivateMethod(person));

    }
}
