package org.panda.datastructure;

import org.junit.Test;

import java.util.ArrayDeque;

/**
 * @author jvfagan
 * @since JDK 1.8  2019/10/6
 **/
public class QueueStackTest {
    @Test
    public void testLinkedListStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push("第一");
        stack.push("第二");
        stack.push("第三");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    @Test
    public void testLinkedListQueue() {
        LinkedListQueue queue = new LinkedListQueue();
        queue.put("第一");
        queue.put("第二");
        queue.put("第三");
        while (!queue.isEmpty()) {
            System.out.println(queue.get());
        }
    }

    /**
     * 利用双端队列实现栈与队列的数据结构
     */
    @Test
    public void testArrayDeque() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.addFirst("第一");
        arrayDeque.addFirst("第二");
        arrayDeque.addFirst("第三");
        while (!arrayDeque.isEmpty()){
            // 栈
//            System.out.println(arrayDeque.pollFirst());
            // 队列
            System.out.println(arrayDeque.pollLast());
        }
    }
}
