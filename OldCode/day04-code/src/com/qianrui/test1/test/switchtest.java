package com.qianrui.test1.test;

public class switchtest {
    public static void main(String[] args) {
        /*
        switch语句格式：
        switch(表达式){         此处表达式不是去判断,而是得到一个具体的结果.

            case 值1:
                语句体1;
                break;

            case 值2:
                语句体2;
                break;

            …

            default:
                语句体n + 1;
                break;

        }

        执行流程:
        1.首先计算表达式的值.
        2.依次和case后面的值进行比较,如果有对应的值,就会执行相应的语句,
        在执行的过程中,遇到break就会结束.
        3.如果所有的case后面的值都不匹配,就会执行default里面的语句,
        然后结束整个switch语句.

        格式说明:
        1.表达式:(将要匹配的值)取值为byte、short、int、char。
                 JDK5以后可以是枚举,JDK7以后可以是String。
        2.case:后面跟的是要和表达式进行比较的值(被匹配的值)。
        3.break:表示中断,结束的意思,用来结束switch语句。
        4.default:表示左右情况都不匹配的时候,就执行该处的内容,
                  和if语句的else相似.
        5.case后面的值只能是字面量,不能是变量.
        6.case给出的值不允许重复.

        注意:
        1.位置:default不一定是写在最下面,我们可以写在任意位置,只不过习惯写在最下面.
        2.省略:default可以省略,语法不会有问题,但是不建议省略.

        case穿透:
            就是语句体当中没有写break导致的.
            执行流程:
                首先还是会拿这小括号中表达式的值跟下面每一个case进行匹配,
                如果匹配上了,就会执行对应的语句,如果说此时发现了break,
                那么结束整个switch语句.
                如果没有发现break,那么程序会继续执行下一个case,一直遇到break或者右大括号为止.
            使用场景:
                如果多个case的语句重复了,那么我们考虑利用case穿透去简化代码.


         */
    }
}
