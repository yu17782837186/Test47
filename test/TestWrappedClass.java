package cn.qq.com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转换成包装类对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(12); //valueOf方法手动装箱
        Integer c = Integer.valueOf(26);
        //把包装类转换成基本数据类型
        int d = a.intValue();
        double e = b.doubleValue();
        byte f = c.byteValue();

        //把字符串转换包装类对象
        Integer g = new Integer("666");
        Integer h = Integer.parseInt("333");


        //把包装类对象转换成字符串
        String s = g.toString();
        System.out.println(g);
        System.out.println(s);
        //常见的常量
        System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
        System.out.println("int类型最小的整数："+Integer.MIN_VALUE);
    }
}
