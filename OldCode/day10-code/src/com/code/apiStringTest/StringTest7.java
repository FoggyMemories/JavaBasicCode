package com.code.apiStringTest;

public class StringTest7 {
    public static void main(String[] args) {
        /*
        敏感词替换:

        String replace(旧值,新值)  替换
        注意点:只有返回值才是替换之后的结果


         */

        //获取到说的话
        String talk = "你玩的真好,以后不要再完了,TMD,CNM";


        //可以定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};


        //循环得到数组中的每一个敏感词,依次进行替换
        //把里面的敏感词TMD替换为***;
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }


        //打印输出
        System.out.println(talk);

    }
}
