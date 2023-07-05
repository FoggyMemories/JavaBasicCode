package com.day05;

public class JavaDoing {
    public static void main(String[] args) {
        /*
        Java内存分配
        1.栈           方法运行时使用的内存,比如main方法运行,进入方法栈中执行
        2.堆           存储对象或者数组,new来创建的,都存储在堆内存
        3.方法区        存储可以运行的class文件
        4.本地方法栈    JVM在使用操作系统功能的时候使用,和我们开发无关
        5.寄存器        给CPU使用,和我们开发无关

        注意:从JDK8开始,取消方法区,新增元空间.
            把原来方法区的多种功能进行拆分,有的功能放到了堆中,
            有的功能放到了元空间中.
         */
    }
}
