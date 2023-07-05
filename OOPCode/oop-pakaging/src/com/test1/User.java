package com.test1;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private char gender;
    private int age;

    //快捷键：
    //alt + insert
    //alt + Fn + insert

    //空参   快捷键选择 空白 即可直接生成

    public User() {
    }

    //带全部参数的构造  同理可用快捷键直接生成
    public User(String username,String password,String email,char gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;

    }
    //get和set方法
    //5*2=10

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }



}
