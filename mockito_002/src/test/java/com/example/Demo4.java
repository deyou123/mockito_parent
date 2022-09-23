package com.example;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

/**
 * @author DeYou
 * @date 2022/9/23
 */
public class Demo4 {
    @Test(expected = RuntimeException.class)
    public void doThrow_when(){
        //模拟list 对象
        List list = mock(List.class);
        //设置当list 添加1 时抛出 RntimeException 异常
        doThrow(new RuntimeException()).when(list).add(1);
        list.add(1);
    }
}