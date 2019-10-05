package org.panda.jvm;

/**
 * JVM
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/3
 **/
public class VirtualMachine {
    /**
     * int(32位)补码值
     *
     * @param n
     * @return
     */
    public static String intValue(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int result = (n & 0x80000000 >>> i) >>> (31 - i);
            stringBuilder.append(result);
        }
        return stringBuilder.toString();
    }

    /**
     * float在JVM中中的真实值
     *
     * @param n
     * @return
     */
    public static String floatValue(float n) {
        return Integer.toBinaryString(Float.floatToRawIntBits(n));
    }

    /**
     * 打印传递参数以及最大可用堆内存
     *
     * @param args
     */
    public static void simpleArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数" + (i + 1) + ":" + args[i]);
        }
        System.out.println("-Xmx" + Runtime.getRuntime().maxMemory() / 1000 / 1000 + "M");
    }


}
