package com.code.test6;

public class GirlFriend {
    /*
    案例:对象数组4
        定义数组存储4个女朋友的对象
        女朋友的属性:姓名、年龄、性别、爱好
        要求1：计算出这4个女朋友的平均年龄
        要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来
     */

    //定义女朋友的属性：
    private String name;
    private int age;
    private char gender;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, char gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
