package com.code.allInOneWork;

public class flexStringCase1 {
    public static void main(String[] args) {
        /*
        练习:调整字符串
            给定两个字符串,A和B.
            A的旋转操作就是将A的最左边字符移动到最右边

            例如:若A = "abcde",在移动依次之后的结果就是"bcdea";

            如果在若干次调整操作之后,A能变成B,那么返回True
            如果不能匹配成功,则返回false
         */

        String strA = "abcde";
        String strB = "cdeab";

        //调用方法进行比较
        boolean result = check(strA,strB);
        System.out.println(result);

    }

    //旋转字符串
    //把左侧的字符移动到右侧
    public static String rotate(String str) {

        StringBuilder sb = new StringBuilder();

        //一般有两个办法:
        //1.用subString进行截取,把最左侧的字符截取出来拼接到右侧去.

        /*
        截取思路:
        获取最左侧那个字符
        char first = str.charAt(0);
        截取剩余的字符
        String end = str.substring(1);
        进行拼接
        return end + first;
        */


        //2.可以把字符串先变成一个字符数组,然后调整字符数组里面的数据,最后再把字符数组变成字符串.

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(c);
        }
        sb.append(str.charAt(0));

        String s = sb.toString();
        return s;
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        //所有的情况都比较完毕了,还不一样,那么直接返回false
        return false;
    }
}
