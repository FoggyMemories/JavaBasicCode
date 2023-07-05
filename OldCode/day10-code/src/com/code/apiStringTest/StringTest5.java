package com.code.apiStringTest;

public class StringTest5 {
    public static void main(String[] args) {
        /*
        手机号码屏蔽,将手机号码中间4为变为****;
        String substring(int beginIndex,int endIndex) 截取
            注意点:包头不包尾,包左不包右
                  只有返回值才是截取的小串
        String substring(int beginIndex) 截取到末尾
         */


        //1.获取一个手机号码

        String phoneNumber = "15539560852";


        //2.截取手机号码前面的3位
        //因为只有返回值才是截取的小串
        //应该用一个变量去接收
        String start = phoneNumber.substring(0, 3);


        //3.截取手机号码的后面4位
        String end = phoneNumber.substring(7);


        //4.进行拼接
        String result = start + "****" + end;


        //5.打印输出
        System.out.println(result);
    }
}
