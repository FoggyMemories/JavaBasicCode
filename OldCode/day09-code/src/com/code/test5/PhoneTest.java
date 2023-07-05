package com.code.test5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();

            System.out.println("请输入第" + (i + 1) + "个手机的品牌");
            String brand = sc.next();
            p.setBrand(brand);

            System.out.println("请输入第" + (i + 1) + "个手机的价格");
            double price = sc.nextDouble();
            p.setPrice(price);

            System.out.println("请输入第" + (i + 1) + "个手机的颜色");
            String color = sc.next();
            p.setColor(color);

            arr[i] = p;
        }

        double sum = 0;
        double average;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            System.out.print("第" + (i + 1) + "个手机的品牌是:" + phone.getBrand() + " ");
            System.out.println();
            System.out.print("第" + (i + 1) + "个手机的价格是:" + phone.getPrice() + " ");
            System.out.println();
            System.out.print("第" + (i + 1) + "个手机的颜色是:" + phone.getColor() + " ");
            System.out.println();
        }

        System.out.println("三款手机的平均价格是:" + average);
    }
}
