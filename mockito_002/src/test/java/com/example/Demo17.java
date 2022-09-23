package com.example;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author DeYou
 * @date 2022/9/23
 */
public class Demo17 {
    @Test
    public void verify_interaction(){
        List list = mock(List.class);
        List list2 = mock(List.class);
        List list3 = mock(List.class);
        list.add(1);
        verify(list).add(1);
        verify(list,never()).add(2);
        //验证零互动行为
        verifyZeroInteractions(list2,list3);
    }
}