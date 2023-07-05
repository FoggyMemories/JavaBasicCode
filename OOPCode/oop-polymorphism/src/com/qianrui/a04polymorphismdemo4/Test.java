package com.qianrui.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog d = (Dog) a1;
        d.setAge(2);
        d.setColor("黑");

        Animal a2 = new Cat();
        Cat c = (Cat) a2;
        c.setAge(3);
        c.setColor("灰");

        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);

        p1.keepPet(d, "狗头");
        p2.keepPet(c, "鱼");
    }
}
