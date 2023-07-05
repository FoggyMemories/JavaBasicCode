package com.test1;

public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("钱睿");
        u.setGender('男');
        u.setAge(20);
        u.setEmail("2633170527@qq.com");
        u.setPassword("1234567890asd");

        System.out.println(u.getUsername());
        System.out.println(u.getGender());
        System.out.println(u.getAge());
        System.out.println(u.getEmail());
        System.out.println(u.getPassword());
    }
}
