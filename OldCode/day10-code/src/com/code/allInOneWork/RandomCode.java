package com.code.allInOneWork;

import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：
        长度为5
        内容中有4位是字母，有1位是数字
        其中数字只有一位，但是可以出现在随机的位置
         */
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i <= 25){
                arr[i] = (char)('a' + i);
            } else {
                arr[i] = (char)('A' + i - 26);
            }
        }
        Random r = new Random();
        int num = r.nextInt(9);
        int shuffle = r.nextInt(5);

        int[] arrCode = new int[5];
        for (int i = 0; i < arrCode.length; i++) {
            arrCode[i] = r.nextInt(arr.length);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrCode.length; i++) {
            if(i == shuffle) {
                sb.append(num);
            } else {
                sb.append(arr[arrCode[i]]);
            }
        }
        String str = sb.toString();
        System.out.println(str);

    }
}

