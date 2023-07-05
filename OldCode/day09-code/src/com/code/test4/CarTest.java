package com.code.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1.创建一个数组用来存3个汽车对象
        Car[] arr = new Car[3];

        //2.创建汽车对象,数据来源于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();  //应该写在循环的内，每次创建新的数据的时候就会进行重新采集
            //相当于每一次都创建了一个新的对象

            //录入品牌
            System.out.println("请输入第" + (i + 1) + "个汽车的品牌:");
            String brand = sc.next();
            c.setBrand(brand);

            //录入价格
            System.out.println("请输入第" + (i + 1) + "个汽车的价格:");
            while(true) {
                double price = sc.nextDouble();
                if (price >= 0 && price <= 1000000000) {
                    c.setPrice(price);
                    break;
                } else {
                    System.out.println("您输入的价格有误请,重新输入");
                }
            }


            //录入颜色
            System.out.println("请输入第" + (i + 1) + "个汽车的颜色:");
            String colour = sc.next();
            c.setColour(colour);


            //把汽车对象添加到数组当中
            arr[i] = c;   //如果第14行写在外面则每次进入数组的值都为一样的，并且覆盖
        }

        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.print(car.getBrand() + " ");
            System.out.println();
            System.out.print(car.getPrice() + " ");
            System.out.println();
            System.out.print(car.getColour() + " ");
            System.out.println();
        }
    }
}
