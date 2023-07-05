package com.qian.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_ATUDENT = "1";
    private static final String DELET_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUARY_STUDENT = "4";
    private static final String EXIT = "5";

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            //欢迎界面
            System.out.println("------------------欢迎来到新一代学生管理系统------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出系统");
            System.out.println("请输入你的选择:");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case ADD_ATUDENT -> addStudent(list);
                case DELET_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUARY_STUDENT -> quaryStudent(list);
                case EXIT -> {
                    System.out.println("退出系统");
                    /*

                    停止外循环的两种方法:
                    break loop;  跳出外循环
                    System.exit(0);  停止虚拟机的运行

                     */
                    break loop;
                }
                default -> System.out.println("选项错误");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        //利用空参构造进行学生对象的创建
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                //表示id已经存在
                System.out.println("id重复,请重新输入");

            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);
        /*
        利用有参构造进行学生数据的添加
         Student s = new Student(id,name,age,address);
         */

        //吧学生对象添加到集合当中
        list.add(s);
        //提示成功
        System.out.println("学生信息添加成功！");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入需要删除的id");
            String id = sc.next();

            //查询id在集合中的索引
            int index = getIndex(list, id);
            //对index进行判断
            //如果为-1,就表示不存在,结束方法,回到开始菜单
            if (index >= 0) {
                //如果大于等于0,就表示存在,直接删除
                list.remove(index);
                //提示
                System.out.println("id为:" + id + "的学生删除成功");
            } else {
                System.out.println("id不存在,删除失败");
                break;
            }
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的id不存在,请重新输入");
            return;
        }

        //当代码执行到这里的时候,表示当前id是存在de
        //获取要修改的学生对象
        Student stu = list.get(index);

        //输入其他信息并进行修改
        System.out.println("请输入要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改学生的年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改学生的家庭地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");

    }

    //查询学生
    public static void quaryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前系统没有学生信息,请添加后进行查询.");
            //结束方法
            return;
        }
        //打印一下表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        //当代码执行到这里的时候,表示结合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        /*
        //循环遍历结合，判断里面每一个学生对象
        //获取id并进行判断
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
        */

        return getIndex(list, id) >= 0;
    }

    //通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list, String id) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student stu = list.get(i);
            //得到每一个学生对应的id
            String sid = stu.getId();
            //拿着集合中的学生id跟要删除的id进行比较
            if (sid.equals(id)) {
                //如果一样,那么就返回索引
                return i;
            }
        }

        //如果都不匹配,则将返回 -1;
        return -1;
    }
}
