package com.allen.springbootdemo.springinaction.chap2;

import org.springframework.stereotype.Component;

/**
 * @Auther: allen
 * @Date: 2020-05-10 09:40
 * @Description:
 */
@Component
public class SgtPappers implements CompactDisk {
    private String title = "Sgt. Papper's Lonely Hearts Club Band.";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.printf("Playing %s by %s",title, artist);
    }
}
