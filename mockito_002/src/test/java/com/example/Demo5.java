package com.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * @author DeYou
 * @date 2022/9/23
 */
public class Demo5 {
    @Mock
    private List mockList;



    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }
}