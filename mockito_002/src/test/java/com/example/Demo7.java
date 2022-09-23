package com.example;


import org.junit.Test;
import org.mockito.ArgumentMatcher;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.*;

/**
 * @author DeYou
 * @date 2022/9/23
 */
public class Demo7 {
    @Test
    public void argumentMatchersTest(){
        //创建mock对象
        List<String> mock = mock(List.class);

        //argThat(Matches<T> matcher)方法用来应用自定义的规则，可以传入任何实现Matcher接口的实现类。
        when(mock.addAll(argThat(new IsListofTwoElements()))).thenReturn(true);

        mock.addAll( Arrays.asList("one","two"));
        //mock.addAll( Arrays.asList("one","two","three"));
        //IsListofTwoElements用来匹配size为2的List，因为例子传入List为三个元素，所以此时将失败。
        verify(mock).addAll(argThat(new IsListofTwoElements()));
    }

    class IsListofTwoElements extends ArgumentMatcher<List>
    {
        public boolean matches(Object list)
        {
            return((List)list).size()==2;
        }
    }
}