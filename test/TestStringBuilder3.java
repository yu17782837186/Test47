package cn.qq.com;

public class TestStringBuilder3 {
    public static void main(String[] args) {
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i <6000 ; i++) {
            str = str + i;
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存时间："+(time2 - time1));
        System.out.println("String占用内存空间:"+(num2 - num1));//获取系统剩余内存空间
        StringBuilder sb = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i <6000 ; i++) {
            sb.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用的内存时间："+(time4 - time3));
        System.out.println("StringBuilder占用的内存空间："+(num4 - num3));//获取系统剩余内存空间
    }
}
