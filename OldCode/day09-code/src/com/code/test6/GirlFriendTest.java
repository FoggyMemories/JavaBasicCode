package com.code.test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend g1 = new GirlFriend("小芳", 20, '女', "玩电脑");
        GirlFriend g2 = new GirlFriend("小林", 21, '女', "看书");
        GirlFriend g3 = new GirlFriend("小王", 18, '女', "运动");
        GirlFriend g4 = new GirlFriend("小壹", 19, '女', "编程");

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];  //用来替代每个数据的 分 数值
            sum += girlFriend.getAge();
        }
        double avg;
        avg = (sum * 1.0) / arr.length;

        System.out.println("这" + arr.length + "个姑娘的平均年龄为:" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            if (girlFriend.getAge() <= avg) {
                count++;
                System.out.print(girlFriend.getName() + " " + "\n");
                System.out.print(girlFriend.getAge() + " " + "\n");
                System.out.print(girlFriend.getGender() + " " + "\n");
                System.out.print(girlFriend.getHobby() + " " + "\n");
            }
        }
        System.out.println("这" + arr.length + "个姑娘的年龄小于平均年龄的有" + count + "个");
    }
}
