package com.qian.a08oopextendsdemo08;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用

        Manager m = new Manager("qianrui001", "qianrui", 150000, 8000);

        System.out.println(m.getId() + ", " + m.getName() + ", "
                + m.getSalary() + ", " + m.getBouns());


        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("qianrui001");
        c.setName("qianrui");
        c.setSalary(123456);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());

        c.work();
        c.eat();
    }
}
