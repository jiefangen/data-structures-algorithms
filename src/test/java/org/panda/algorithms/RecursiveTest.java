package org.panda.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * 递归算法单元测试
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/2
 **/
public class RecursiveTest {
    @Test
    public void testFibonacci(){
        int result = Recursive.fibonacci(6);
        assertEquals(8, result);
    }
    @Test
    public void testFactorial(){
        int result = Recursive.factorial(4);
        assertEquals(24, result);
    }
    @Test
    public void testQuickSort(){
        int[] arr = {4,3,2,5,1,8,6};
        Recursive.quickSort(arr, 0, arr.length - 1);
        int[] expected = {1,2,3,4,5,6,8};
        assertArrayEquals(expected, arr);
    }
}
