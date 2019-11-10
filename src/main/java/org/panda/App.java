package org.panda;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<byte[]>();
        int count = 0;
        while (true) {
            try {
                list.add(new byte[1024 * 1024]);
                Thread.sleep(100);
                count++;
            } catch (Throwable e) {
                System.out.println(count);
                throw new RuntimeException();
            }
        }
    }
}
