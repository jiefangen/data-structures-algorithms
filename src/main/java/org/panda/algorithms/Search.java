package org.panda.algorithms;

/**
 * 查找算法
 *
 * @author jvfagan
 * @since JDK 1.8  2019/11/8
 **/
public class Search {

    /**
     * 顺序查找(普通)
     * 时间复杂度 - O(n)
     *
     * @param a   数组
     * @param key 查找的关键字
     * @return
     */
    public static int sequential(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 设置哨兵的顺序表查找
     * 此算法有待考量--数组边界问题,不论是设置在表头还是表尾,都会涉及到扩展数组长度
     * 而这样做只会让此算法时间复杂度与空间复杂度都加重
     *
     * @param arr
     * @param key
     * @return
     */
    public static int optimizedSequential(int[] arr, int key) {
        int size = arr.length;
        int[] newArr = new int[size + 1];

        arr[arr.length] = key;
        int i = 0;
        while (arr[i] != key) {
            i++;
        }
        return i;
    }

    /**
     * 折半查找算法(适用于静态查找表)
     * 时间复杂度 - O(log n)
     *
     * @param arr
     * @param key
     * @return
     */
    public static int binary(int[] arr, int key) {
        int low, high, mid;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = (low + high)/2;
            // 差值查找
//            mid = low + ((key - arr[low]) / (arr[high] - arr[low])) * (high - low);
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
