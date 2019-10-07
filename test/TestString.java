package cn.qq.com;

public class TestString {
    public static void main(String[] args) {
//        String str = "zxcv";
//        String str1 = str.substring(2);
//        String str2 = str.substring(2,3);
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);

        //编译器进行了优化，直接在编译的时候将字符串进行拼接
        String str = "hello" + "world";
        String str1 = "helloworld";
        System.out.println(str == str1);//（true）
        String str2 = "hello";
        String str3 = "world";
        //编译的时候不知道变量中存储的是什么，所以没办法在编译的时候进行优化
        String str4 = str2 + str3;
        System.out.println(str1 == str4);//(false)
    }
}
