package org.panda.datastructure;

import java.util.LinkedList;

/**
 * 利用LinkedList模拟栈的数据结构
 * 栈: 先进后出
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/6
 **/
public class LinkedListStack {
    private LinkedList<String> linkedList = new LinkedList<String>();

    public void push(String str){
        linkedList.addFirst(str);
    }

    public String pop(){
        return linkedList.removeFirst();
    }

    // 查看栈顶元素
    public String peek(){
        return linkedList.peek();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
