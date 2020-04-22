package org.panda.algorithms;


import java.util.*;

/**
 * 输入一个字符串，输出该字符串中连续相同长度最长的
 * 相同长度取ASCI码最小的
 *
 * Date 2020年4月20日
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            int length = str.length();

            HashMap<Character,Integer> map = new HashMap<>();
            int count = 1;
            int maxCount = 0;
            for(int i=0; i<length-1; i++){
                char c1 = str.charAt(i);
                char c2 = str.charAt(i+1);
                if (c1 == c2){
                    map.put(c1, count++);
                } else {
                    count = 1;
                }
                maxCount = maxCount < count ? count : maxCount;
            }

            TreeSet<Character> set = new TreeSet<Character>();
            if (map.isEmpty()) {// 都是单元素
                for(int i=0; i<length; i++){
                    set.add(str.charAt(i));
                }
            } else {
                for (Map.Entry<Character,Integer> entry : map.entrySet()) {
//                    System.out.println(entry.getKey() +"  "+ entry.getValue());
                    if (entry.getValue() == maxCount - 1) {
                        set.add(entry.getKey());
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<maxCount; i++){
                sb.append(set.first().toString());
            }
            System.out.print(sb);
        }
        in.close();
    }
}


