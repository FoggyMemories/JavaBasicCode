package com.qian.studentststem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserTest {
    private static final String LOGIN = "1";
    private static final String REGISTER = "2";
    private static final String FORGET = "3";
    private static final String QUARY_USER = "4";
    private static final String EXIT = "5";
    private static final String RANDOM_CODE = "6";

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------欢迎来到学生管理系统！---------------");
        loop:
        while (true) {
            System.out.println("请选择您的操作:");
            System.out.println("1 : 用户登录");
            System.out.println("2 : 用户注册");
            System.out.println("3 : 忘记密码");
            System.out.println("4 : 查询所有信息");
            System.out.println("5 : 退出");
            System.out.println("6 : 刷新验证码");
            System.out.println("-------------------------------------------");
            String choose = sc.next();
            switch (choose) {
                case LOGIN -> logIn(list);
                case REGISTER -> register(list);
                case FORGET -> forget(list);
                case QUARY_USER -> quaryUser(list);
                case EXIT -> {
                    System.out.println("谢谢使用,再见.");
                    break loop;
                }
                case RANDOM_CODE -> {
                    String str = randomCode();
                    System.out.println(str);
                }
                default -> System.out.println("输入的数字有误,请重新输入.");
            }
        }
    }

    //登录
    public static void logIn(ArrayList<User> list) {
        if (list.size() != 0) {
            Scanner sc = new Scanner(System.in);
            String rightCode = randomCode();
            System.out.println("随机产生的验证码为：" + rightCode);
            System.out.println("请输入验证码，确定为真人操作：");
            String inputCode = sc.next();
            if (inputCode.equalsIgnoreCase(rightCode)) {
                loop:
                while (true) {
                    System.out.println("请输入用户名:");
                    String userName = sc.next();
                    if (contains(list, userName)) {
                        //限制输入3次
                        int index = 3;
                        while (index > 0) {
                            System.out.println("请输入密码:");
                            String userNamePassword = sc.next();
                            if (judgeUserNamePassword(list, userNamePassword)) {
                                System.out.println("密码正确");
                                System.out.println("登录成功");
                                break loop;
                            } else {
                                System.out.println("密码有误,请重新输入");
                                System.out.println("输入密码剩余次数:" + index);
                                index--;
                            }
                            if (index == 0) {
                                System.out.println("所输入密码错误次数过多,请稍后尝试");
                                break loop;
                            }
                        }
                    } else {
                        System.out.println("该用户名尚未注册,请先注册");
                        break;
                    }
                }
            } else {
                System.out.println("您所输入的验证码有误");
            }
        } else {
            System.out.println("没有任何用户数据，请先注册");
            System.out.println("-------------------------------------------");
        }
    }

    //注册
    public static void register(ArrayList<User> list) {
        User u = new User();
        Scanner sc = new Scanner(System.in);

        //注册用户名
        while (true) {
            System.out.println("用户名:");
            String userName = sc.next();
            boolean flag = allInJudgeUserName(list, userName);
            if (flag) {
                u.setUserName(userName);
                System.out.println("用户名格式正确,注册的用户名为:" + userName);
                break;
            } else {
                System.out.println("输入的用户名格式有误,请重新输入.");
                System.out.println("(用户名长度必须在3~15位之间,首字符不能为0,且包括英文字母)");
            }
        }

        //注册密码
        while (true) {
            System.out.println("密码:");
            String userPassword = sc.next();
            boolean flag = judgeUserPassword(userPassword);
            if (flag) {
                System.out.println("验证密码:");
                String userCheckingPassword = sc.next();
                if (userCheckingPassword.equals(userPassword)) {
                    u.setUserPassword(userPassword);
                    System.out.println("密码已确认.\n请继续输入相关个人信息");
                    break;
                } else {
                    System.out.println("输入的两次密码不相同,请重新输入");
                }
            } else {
                System.out.println("输入的密码格式有误,请重新输入");
                System.out.println("(密码的长度必须在6~18位之间,且包括英文字母)");
            }
        }

        //身份证号码验证
        while (true) {
            System.out.println("身份证号码:");
            String userId = sc.next();

            if (judgeUserId(userId)) {
                u.setUesrId(userId);
                System.out.println("身份证格式正确,注册身份证号码为:" +
                        userId.substring(0, 4) + "**********" + userId.substring(14));
                break;
            } else {
                System.out.println("输入的身份证格式有误,请重新输入");
            }
        }

        //手机号码验证
        while (true) {
            System.out.println("手机号码:");
            String userPhoneNumber = sc.next();

            if (judgeUserPhoneNumber(userPhoneNumber)) {
                u.setPhoneNumber(userPhoneNumber);
                System.out.println("手机号码已确认,注册的手机号码为:" +
                        userPhoneNumber.substring(0, 3) + "****" + userPhoneNumber.substring(7));
                break;
            } else {
                System.out.println("输入的手机号码有误,请重新输入");
            }
        }

        list.add(u);
        System.out.println("注册成功!");

    }

    //忘记密码
    private static void forget(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("请输入需要找回密码的账户:");
            String forgetUserName = sc.next();
            if (contains(list, forgetUserName)) {
                System.out.println("此用户名存在");
                System.out.println("请输入用户:" + forgetUserName + "注册时的身份证号码:");
                String forgetUserID = sc.next();
                System.out.println("请输入用户:" + forgetUserName + "注册时的手机号码:");
                String forgetUserPhoneNumber = sc.next();

                User u = list.get(getIndex(list, forgetUserName));

                if (forgetUserID.equals(u.getUesrId()) && forgetUserPhoneNumber.equals(u.getPhoneNumber())) {
                    System.out.println("验证成功");
                    while (true) {
                        System.out.println("请输入修改密码:");
                        String newUserPassword = sc.next();

                        //判断新老密码是否相同
                        if (!newUserPassword.equals(u.getUserPassword())) {


                            //判断新的密码格式是否合法
                            if (judgeUserPassword(newUserPassword)) {
                                System.out.println("输入的密码格式正确.");
                                System.out.println("请重新输入验证修改密码");
                                String newTestUserPassword = sc.next();

                                //判断新密码两次输入是否相同
                                if (newTestUserPassword.equals(newUserPassword)) {
                                    u.setUserPassword(newUserPassword);
                                    System.out.println("密码修改成功");
                                    break loop;
                                } else {
                                    System.out.println("两次输入密码不同,请重新输入.");
                                }
                                break;
                            } else {
                                System.out.println("输入的新密码格式有误，请重新输入");
                            }
                        } else {
                            System.out.println("新老密码不能相同,请重新输入");
                        }
                    }
                } else {
                    System.out.println("输入的此用户名所注册的身份证号码或者手机号码有误,请重新输入.");
                }
            } else {
                System.out.println("此用户名不存在.");
                break;
            }
        }
    }

    //查询系统
    private static void quaryUser(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入管理员权限密码:");
        String inputAdminPassword = sc.next();

        //管理员密码:
        String adminPassword = "123456a";
        if (inputAdminPassword.equals(adminPassword)) {
            System.out.println("管理员密码正确");
            System.out.println("-------------------------------------------");
            if (list.size() == 0) {
                System.out.println("当前系统中没有学生信息.请添加后进行查询");
                System.out.println("-------------------------------------------");
                //结束方法
                return;
            }

            //表头
            System.out.println("用户名\t\t密码\t\t身份证号\t\t\t手机号码");
            for (int i = 0; i < list.size(); i++) {
                User u = list.get(i);
                System.out.println(u.getUserName() + "\t\t" + u.getUserPassword()
                        + "\t\t" + u.getUesrId() + "\t\t" + u.getPhoneNumber());
            }
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("所输入管理员权限密码错误");
        }
    }

    //判断用户名是否存在
    public static boolean contains(ArrayList<User> list, String userName) {
        return getIndex(list, userName) >= 0;
    }

    //判断用户名是否存在的索引
    public static int getIndex(ArrayList<User> list, String userName) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            User stu = list.get(i);
            //得到每一个学生对应的name
            String sid = stu.getUserName();
            if (sid.equals(userName)) {
                //如果一样,那么就返回索引
                return i;
            }
        }
        //如果都不匹配,则将返回 -1;
        return -1;
    }

    //判断输入的用户名之中是否含有英文字母
    //如果含有英文字母则为true 否则为false
    public static boolean judgeNumber(String userName) {
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                return true;
            }
        }
        return false;
    }

    //判断首个字符不为0
    public static boolean judgeFirstNumber(String str) {
        char firstChar = str.charAt(0);
        int num = firstChar - 48;
        return num != 0;
    }

    //判断用户名是否符合
    public static boolean allInJudgeUserName(ArrayList<User> list, String userName) {
        int len = userName.length();
        //判断用户名的长度是否符合
        boolean flag1 = len >= 3 && len <= 15;
        //判断用户名是否存在英文字母
        boolean flag2 = judgeNumber(userName);
        //判断用户名是否存在
        boolean flag3 = !contains(list, userName);

        return flag1 && flag2 && flag3;
    }

    //判断密码格式是否符合
    public static boolean judgeUserPassword(String userPassword) {
        int len = userPassword.length();
        //判断密码中是否含有英文字母
        boolean flag1 = judgeNumber(userPassword);
        //判断密码的长度是否合法
        boolean flag2 = len >= 6 && len <= 18;
        return flag1 && flag2;
    }

    //判断身份证号码
    public static boolean judgeUserId(String userId) {
        //判断长度是否为18
        boolean flag1 = userId.length() == 18;
        //判断第一位是否不为0
        boolean flag2 = judgeFirstNumber(userId);
        //判断最后一位是否为x X 或 数字
        boolean flag3 = ((userId.substring(17).equalsIgnoreCase("x") || !judgeNumber(userId.substring(17))));
        //判断1-17位是否为纯数字
        boolean flag4 = !judgeNumber(userId.substring(0, 17));
        return flag1 && flag2 && flag3 && flag4;

    }

    //验证手机号码
    public static boolean judgeUserPhoneNumber(String userPhoneNumber) {
        //判断手机号码是否为纯数字
        boolean flag1 = !judgeNumber(userPhoneNumber);
        //判断手机号码的长度是否为11
        boolean flag2 = userPhoneNumber.length() == 11;
        //判断手机号码首位不为0
        boolean flag3 = judgeFirstNumber(userPhoneNumber);
        return flag1 && flag2 && flag3;
    }

    //判断用户名和密码是否匹配
    public static boolean judgeUserNamePassword(ArrayList<User> list, String userNamePassword) {
        if (contains(list, userNamePassword)) {
            int index = getIndex(list, userNamePassword);
            User stu = list.get(index);
            return stu.getUserPassword().equals(userNamePassword);
        }
        return false;
    }

    //产生随机验证码
    public static String randomCode() {
        //存储所有大小写英文字母
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char) ('a' + i);
            } else {
                arr[i] = (char) ('A' + i - 26);
            }
        }
        Random r = new Random();
        //随机产生0 ~ 9的数字
        int num = r.nextInt(9);

        //产生一个数组用来存储验证码
        int[] arrCode = new int[5];
        //随机产生位数，将这位英文字母放在字符串当中
        int shuffle = r.nextInt(arrCode.length);


        for (int i = 0; i < arrCode.length; i++) {
            arrCode[i] = r.nextInt(arr.length);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrCode.length; i++) {
            if (i == shuffle) {
                sb.append(num);
            } else {
                sb.append(arr[arrCode[i]]);
            }
        }
        return sb.toString();
    }
}