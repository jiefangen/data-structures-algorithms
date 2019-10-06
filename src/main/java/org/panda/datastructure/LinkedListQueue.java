package org.panda.datastructure;

import java.util.LinkedList;

/**
 * 利用LinkedList模拟队列的数据结构
 * 队列: 先进先出
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/6
 **/
public class LinkedListQueue {
    private LinkedList<String> linkedList = new LinkedList<String>();

    public void put(String str){
        linkedList.addFirst(str);
    }

    public String get(){
        return linkedList.removeLast();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

}
