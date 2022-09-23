package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * @author DeYou
 * @date 2022/9/23
 */
@RunWith( MockitoJUnitRunner.class )
public class Demo52 {
    @Mock
    private List mockList;



    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }
}