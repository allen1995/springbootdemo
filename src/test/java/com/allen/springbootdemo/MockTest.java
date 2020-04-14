package com.allen.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @Auther: allen
 * @Date: 2020-04-13 21:32
 * @Description:
 */
@SpringBootTest
public class MockTest {

    @Test
    void simpleVerifyTest(){
        List mockList = mock(List.class);

        mockList.add("one");
        mockList.add("two");

        verify(mockList).add("one");
        //verify(mockList).clear();
    }

    @Test
    void stubTest(){
        List mockList = mock(List.class);

        //数据桩
        when(mockList.get(0)).thenReturn("first");
        when(mockList.get(1)).thenThrow(new RuntimeException());

        System.out.println(mockList.get(0));
        //System.out.println(mockList.get(1));
        System.out.println(mockList.get(3));

        verify(mockList,times(1)).get(0);

    }

    @Test
    void matchersTest(){

        List mockList = mock(List.class);
        when(mockList.get(anyInt())).thenReturn("element");

        System.out.println(mockList.get(999));

        verify(mockList, times(1)).get(anyInt());

    }

    @Test
    void timesTest(){

        List mockList = mock(List.class);

        mockList.add("once");

        mockList.add("twice");
        mockList.add("twice");

        mockList.add("three");
        mockList.add("three");
        mockList.add("three");

        verify(mockList).add("once");
        verify(mockList, times(1)).add("once");

        verify(mockList, times(2)).add("twice");
        verify(mockList,times(3)).add("three");


        verify(mockList, never()).add("never happen");

        verify(mockList, atLeast(1)).add("once");
        verify(mockList, atMost(5)).add("twice");
    }
}
