package com.qianrui.test1.test;

public class iftest {
    public static void main(String[] args) {
        //1.顺序结构 ， 顺序结构语句是java程序默认的执行流程，按照代码的先后顺序，从上到下依次执行
        //2.分支结构 ， if。
        /*if语句的第一种格式：
        if(关系表达式){
            语句体;
        }
        执行流程：
        1.首先计算关系表达式的值
        2.如果关系表达式的值为true就执行语句体
        3.如果关系表达式的值为false就不执行语句体
        4.继续执行后面的其他语句

          if语句的第二种格式：
        if(关系表达式){
            语句体1;
          } else{
            语句体2;
          }
          执行流程：
          1.首先计算关系表达式的值
          2.如果关系表达式的值为true，就执行语句体1
          3.如果关系表达式的值为false，就执行语句体2
          4.继续执行后面的其他语句

          if语句的第三种格式：
        if(关系表达式1){
            语句体1；
        } else if(表达关系式2){
                语句体2；
            }

            ……

            else{
                语句体 n + 1;
            }
          执行流程：
          1.首先计算关系式1的值
          2.如果为true就执行语句体1;如果为false就计算关系表达式2的值
          3.如果为true就执行语句体2;如果为false就计算关系表达式3的值
          4. …
          5.如果所有关系表达式结果都为false,就执行语句体n + !
         */
    }
}
