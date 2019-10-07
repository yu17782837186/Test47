package cn.qq.com;

public class TestStringBuilder {
    public static void main(String[] args) {
        String str;
        //StringBuilder线程不安全，效率高（一般使用StringBuilder）
        //StringBuffer线程安全，效率低
        StringBuilder sb = new StringBuilder("zxcvb");

        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
        sb.setCharAt(3,'Y');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
    }
}
