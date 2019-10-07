package cn.qq.com;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char tmp = (char)('a'+i);
            sb.append(tmp);
        }
        System.out.println(sb);
        sb.reverse();//逆序
        System.out.println(sb);
        sb.setCharAt(2,'于');//将该位置的字符代替
        System.out.println(sb);
        sb.insert(2,'洪');
        System.out.println(sb);
        //链式调用，核心就是：该方法调用了return this，把自己返回了
        //insert和delete都调用了return this
        sb.insert(2,'命').insert(2,'白');
        System.out.println(sb);
        //删除某一个区间段
        sb.delete(2,26);
        System.out.println(sb);
        sb.delete(0,2).delete(0,2);
        System.out.println(sb);
    }
}
