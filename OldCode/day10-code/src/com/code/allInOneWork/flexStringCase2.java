package com.code.allInOneWork;

public class flexStringCase2 {
    public static void main(String[] args) {


        String strA = "abcde";
        String strB = "cdeab";

        //调用方法进行比较
        boolean result = check(strA, strB);
        System.out.println(result);


    }

    public static String rotate(String str) {

        //"ABC"  ->  ['A','B','C']
        char[] arr = str.toCharArray();

        //拿到 0 索引上的字符
        char first = arr[0];

        //把剩余的字符依次往前挪一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //把原来 0 索引上的字符放到最后一个索引上
        arr[arr.length - 1] = first;

        //再利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
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
