package com.allen.springbootdemo.springinaction;

import com.allen.springbootdemo.springinaction.chap2.CDPlayerConfig;
import com.allen.springbootdemo.springinaction.chap2.CompactDisk;
import com.allen.springbootdemo.springinaction.chap2.SgtPappers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: allen
 * @Date: 2020-05-10 09:43
 * @Description:
 */
@SpringBootTest
public class CDPlayerConfigTest {

    @Test
    public void applicationContextTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        SgtPappers pappers = (SgtPappers)context.getBean("sgtPappers");
        Assert.assertTrue(pappers instanceof CompactDisk);
    }


}
