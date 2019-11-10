package org.panda.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 查找算法单元测试
 * @author jvfagan
 * @since JDK 1.8  2019/11/8
 **/
public class SearchTest {
    @Test
    public void testSequential(){
        int[] a = {8,1,2,4,3,6};
        int result = Search.sequential(a,5);
        assertEquals(-1, result);
    }

    @Test
    public void testBinary(){
        int[] arr = {1,16,24,35,47,59,62,73,88,99,8896564};
        int result = Search.binary(arr,889);
        assertEquals(-1, result);
    }
}
