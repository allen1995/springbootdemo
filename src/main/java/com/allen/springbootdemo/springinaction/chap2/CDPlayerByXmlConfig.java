package com.allen.springbootdemo.springinaction.chap2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: allen
 * @Date: 2020-05-10 10:24
 * @Description:
 */
@Configuration
@ImportResource("classpath:/cdplayer.xml")
public class CDPlayerByXmlConfig {
}
