package com.code.test3;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];


        //2.创建三个商品对象
        Goods g1 = new Goods("001","xiaomi11pro",2999.99,100);
        Goods g2 = new Goods("002","iphoneSe",3599.00,10);
        Goods g3 = new Goods("003","huaWeiMate50",5999.00,999);

        //3.把商品添加到数组当中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;


        //4.验证，遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getStock());
        }
    }
}
