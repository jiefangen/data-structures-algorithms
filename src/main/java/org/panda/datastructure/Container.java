package org.panda.datastructure;

import java.util.*;

/**
 * Java集合容器
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/5
 **/
public class Container {

    public static void main(String[] args) {
        Collection collection = new LinkedList();

        Map map = new HashMap();
        ArrayList list = new ArrayList(10);
        list.add(3);
        System.out.println(list.size());
        list.set(0,12);
        System.out.println(list.get(0));
        list.remove(0);

        LinkedList linkedList = new LinkedList();
        linkedList.add(12);
        linkedList.remove(0);
        Collections.synchronizedList(linkedList);

        ArrayDeque ArrayDeque = new ArrayDeque();
        ArrayDeque.add(0);
        ArrayDeque.addFirst(0);

        Vector vector = new Vector<>();

        Stack stack = new Stack();

        Set hashSet = new HashSet();

        System.out.println(6 << 2);

        TreeMap TreeMap = new TreeMap();

        Thread thread = new Thread();
    }
}
