package com.day06.methodtest;

import java.util.Scanner;

public class Methodtest4_1 {
    public static void main(String[] args) {
         /*
        练习：比较大小
            需求：定义方法，比较两个长方形的面积
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长和宽：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double area1 = GetArea(a,b);
        System.out.println("第一个长方形的面积为：" + area1);
        System.out.println("请输入第二个长方形的长和宽：");
        int c = sc.nextInt();
        int d = sc.nextInt();
        double area2 = GetArea(c,d);
        System.out.println("第二个长方形的面积为：" + area2);

        Compare(area1,area2);

    }
    public static double GetArea(double x,double y){
        double area = x * y;
        return area;
    }
    public static void Compare(double i,double u){
        if(i < u){
            System.out.println("第二个长方形的面积大。");
        } else{
            System.out.println("第一个长方形的面积大。");
        }
    }
}
/*
带返回值方法定义：格式
        public static 返回值类型 方法名 (参数){
            方法体;
            return 返回值;
        }
   方法与方法之间是平行关系,不能互相嵌套定义.
   方法的编写顺序和执行顺序无关,与调用顺序有关.

   方法的返回值类型为void,表示该方法没有返回值,
        没有返回值的方法可以省略return语句不写.
        如果要编写return,后面不能跟具体的数据.   此时表示结束方法

        return语句下面,不能编写代码,因为永远执行不到,属于无效代码
 */
