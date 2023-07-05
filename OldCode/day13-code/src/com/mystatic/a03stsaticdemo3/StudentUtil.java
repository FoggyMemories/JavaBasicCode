package com.mystatic.a03stsaticdemo3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){}

    //静态方法
    //获取集合中年龄最大的岁数

    public static int getMaxAgeStudent(ArrayList<Student> list){
        //1.定义一个参照物
        int max = list.get(0).getAge();

        //2.循环遍历集合
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge > max){
                max = tempAge;
            }
        }
        return max;
    }
}
