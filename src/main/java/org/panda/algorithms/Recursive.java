package org.panda.algorithms;

/**
 * 递归算法
 * 递归运行效率较低，因为有函数调用的开销，递归多次也可能造成栈溢出。
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/2
 **/
public class Recursive {
    /**
     * 斐波那契数列
     * fib(n)=fib(n-1)+fib(n-2)
     *
     * @param n 计算值
     * @return 计算结果
     */
    public static int fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * 阶乘
     *
     * @param n 数值
     * @return 计算结果
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left++] = arr[right];
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right--] = arr[left];
            }
        }
        arr[left] = pivot;
        return left;
    }

    /**
     * 快速排序
     *
     * @param arr 排序数组
     * @param low 起始位置
     * @param high 结束位置
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }
}
