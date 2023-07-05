package com.code.apiStringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        /*
        字符串的内容是不会发生改变的，他的对象在创建之后不能被更改
         */
        //1.String是Java定义好的一个类。定义在java.lang包中，属于java的核心包，所以使用的时候不需要导包。
        //2.Java程序中的所有字符串文字(例如"钱睿").都被视为此类的对象.
        //3.字符串不可变,他们的值在创建后不能被更改


        //1.使用直接复制的方式获取一个字符串对象
        String name = "123";
        String newNane = "456";
        System.out.println(name + newNane);
        //第14 ~ 16 行一共生成了三个字符串


        //2.使用new的方式来获取一个字符串对象
        //空参构造:可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!"); //此时s2 表示 ""

        //3.有参构造,传递一个字符根据传递的字符内容在创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);




        //利用字符传递数组,根据字符数组的内容再创建一个新的字符串对象
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个自己数组,根据字节数组的内容再创建一个新的字符串对象
        //byte
        byte[] bytes = {97,98,99,100};  //在ascii表上面查询过后再输出
        String s5 = new String(bytes);
        System.out.println(s5);  //a b c d
    }
}
