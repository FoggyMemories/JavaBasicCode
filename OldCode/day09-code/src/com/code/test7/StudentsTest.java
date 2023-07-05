package com.code.test7;

import java.util.Scanner;

public class StudentsTest {
    public static void main(String[] args) {
        Students[] arr = new Students[3];

        Students s1 = new Students(1, "Qianrui001", 18);
        Students s2 = new Students(2, "Qianrui002", 19);
        Students s3 = new Students(3, "Qianrui003", 20);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Scanner sc = new Scanner(System.in);


        while (true) {
            Students sInput = new Students();
            System.out.println("请输入新增加学生的学号:");
            int schoolId = sc.nextInt();
            sInput.setSchoolId(schoolId);


            boolean flag = contains(arr, sInput.getSchoolId());
            //进行存在性判断
            //已存在 --- 不用添加
            //不存在 --- 就可以把学生对象添加到数组中
            //此时数组已满,应该新建一个数组,长度是原来的数组 + 1;
            if (flag) {
                //已存在 --- 不用添加
                System.out.println("当前学生学号已经存在,请重新修改id后再进行");
            } else {
                System.out.println("请输入新增加学生的姓名:");
                String name = sc.next();
                sInput.setName(name);

                System.out.println("请输入新增加学生的年龄:");
                int age = sc.nextInt();
                sInput.setAge(age);

                Students s4 = new Students(schoolId, name, age);
                //不存在 --- 就可以把学生对象添加到数组中
                //需要进行对数组中的数据饱和度进行判断,是否已经存满
                //此时数组已满,应该新建一个数组,长度是原来的数组 + 1;
                int count = getCount(arr);
                if (count == arr.length) {
                    //表示已经存满
                    //创建一个新数组,长度为 老数组的长度 + 1,然后把老数组拷贝到新数组当中
                    //用一个新的方法实现
                    Students[] newArr = creatNewArr(arr);

                    //把新的元素添加即可
                    newArr[count] = s4;
                    //遍历所有学生的信息
                    //利用新的方法去打印
                    System.out.println("添加过后所有学生的信息为");
                    printArr(newArr);
                    deletePrint(newArr);
                    plusAge(newArr);
                    printArr(newArr);
                    break;

                } else {
                    //表示未存满
                    arr[count] = s4;
                    //遍历所有学生的信息
                    //利用新的方法去打印
                    printArr(arr);
                    deletePrint(arr);
                    plusAge(arr);
                    printArr(arr);
                    break;
                }
            }
        }
    }

    //创建一个方法用来比较新加的学号是否重复

    //思考
    //1.我要干嘛? 唯一性的判断
    //2.我敢这件事情,需要什么才能完成? 数组id
    //3.调用出是否需要继续使用方法结果? 必须返回
    public static boolean contains(Students[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            Students stu = arr[i];
            //应该进行一个非空索引的判断,因为如果元素中索引为空,则会报错
            if (stu != null) {
                //获取数组中学生对象的id
                int sid = stu.getSchoolId();
                //开始进行比较

                if (sid == id) {
                    return true;
                }
            }
        }
        //当循环结束之后,还没有找到一样的,就代表数组中要查找的id是不存在的.
        return false;
    }

    //定义一个方法用来判断数组中已经存了几个元素
    public static int getCount(Students[] arr) {
        //定义一个计数器用来统计
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        //当循环结束之后就知道数组中一共有几个元素
        return count;
    }

    //创建一个新数组,然后把老数组拷贝到新数组当中
    public static Students[] creatNewArr(Students[] arr) {
        Students[] newArr = new Students[arr.length + 1];

        //遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //将老数组中的元素添加到新数组当中
            newArr[i] = arr[i];
        }

        //把新数组进行返回操作
        return newArr;
    }

    //用一个新的方法来打印一下这个数组,如果不为空的情况下才进行打印
    public static void printArr(Students[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Students stu = arr[i];
            if (stu != null) {
                System.out.print(stu.getSchoolId() + "," + stu.getName() + "," + stu.getAge());
                System.out.println();
            }
        }
    }


    public static void deletePrint(Students[] arr) {
        System.out.println("########################################");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除id的学生信息");
            int delete = sc.nextInt();
            int index = findDifferent(arr, delete);
            if (index >= 0) {
                //如果存在,则删除
                arr[index] = null;
                //遍历数组
                System.out.println("删除过后所有学生的信息为:");
                printArr(arr);
                break;
            } else {
                //如果不存在,则提示删除失败
                System.out.println("当前id不存在,删除失败,请重新输入");
            }
        }
    }

    public static void plusAge(Students[] arr) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入需要进行年龄自增的学生id");
            int plus = sc.nextInt();
            int index = findDifferent(arr, plus);
            if (index >= 0) {
                Students stu = arr[index];
                int newAge = stu.getAge() + 1;
                stu.setAge(newAge);
                break;
            } else {
                System.out.println("当前id不存在,年龄自增失败,请重新输入");
            }
        }
    }

    public static int findDifferent(Students[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //一次得到每一个学生对象
            Students stu = arr[i];
            //对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getSchoolId();
                if (sid == id) {
                    return i;
                }
            }
        }
        //当循环结束之后,还没有找到就表示不存在
        return -1;
    }

}