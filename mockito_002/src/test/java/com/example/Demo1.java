package com.example;

import org.junit.Test;


import java.util.List;


import static org.mockito.Mockito.*;

/**
 * @author DeYou
 * @date 2022/9/23
 */
public class Demo1 {
    @Test
    public void verify_behaviour(){
        //模拟创建一个List对象
        List mock = mock(List.class);
        //使用mock的对象
        mock.add(1);
        mock.clear();
        //验证add(1)和clear()行为是否发生
        verify(mock).add(1);
        verify(mock).clear();
    }


}