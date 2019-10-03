package org.panda.datastructures;

/**
 * JVM实际值
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/3
 **/
public class ActualValue {
    /**
     * int(32位)补码值
     *
     * @param n int值
     * @return 补码
     */
    public static String complementCode(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int result = (n & 0x80000000 >>> i) >>> (31 - i);
            stringBuilder.append(result);
        }
        return stringBuilder.toString();
    }
}
