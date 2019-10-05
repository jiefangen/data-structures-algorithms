package org.panda.jvm;

/**
 * 局部变量对垃圾回收的影响
 *
 * @author jvfagan
 * @since JDK 1.8  2019/10/4
 **/
public class VarImpactGc {
    // 无法回收
    public void localvarGc1() {
        byte[] a = new byte[6 * 1024 * 1024];
        System.gc();
    }

    // 可回收
    public void localvarGc2() {
        byte[] a = new byte[6 * 1024 * 1024];
        a = null;
        System.gc();
    }

    // 无法回收
    public void localvarGc3() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    // 可回收
    public void localvarGc4() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c = 10;
        System.gc();
    }

    // 可回收
    public void localvarGc5() {
        localvarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        VarImpactGc ins = new VarImpactGc();
        ins.localvarGc4();
    }
}
