package com.code.stringBuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); //容量 最小为16
        System.out.println(sb.length());   //长度

        sb.append("abcdefghijklomnpqrstuvwxyz0123456789");

        System.out.println(sb.capacity());//超过16*2 + 2的时候，会以实际长度为准
        System.out.println(sb.length());
    }
}
