package com.code.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的


    //用字符串数组表示角色的长相
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //同样的用字符串数组表示出攻击和受伤的招式
    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };


    //阅读时一般先阅读构造方法,应该将两个构造体放在最前面
    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBlood() {
        return blood;
    }


    public void setBlood(int blood) {
        this.blood = blood;
    }


    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getFace() {
        return face;
    }


    public void setFace(char gender) {
        Random r = new Random();

        //长相是随机的
        if (gender == '男') {
            //从boyfaces里面随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            //从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }

    }


    //定义一个方法用于攻击别人
    //方法的调用者去攻击参数
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];


        //输出一个攻击的效果
        System.out.printf(kungFu, this.getName(), role.getName());
        System.out.println();

        //计算造成的伤害
        int hurt = r.nextInt(20) + 1;

        //修改一下挨揍人的血量
        //剩余血量
        int remainBoold = role.getBlood() - hurt;

        //对剩余血量进行一个验证,如果为负数,就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改一下挨揍人的血量
        role.setBlood(remainBoold);

        //受伤描述
        //根据人物的剩余血量来判断应该使用什么样的描述
        //血量 > 90 时,用 0 索引的描述
        //80 ~ 90      1 索引的描述
        //70 ~ 80      2 索引的描述
        //60 ~ 70      3 索引的描述
        //40 ~ 60      4 索引的描述
        //20 ~ 40      5 索引的描述
        //10 ~ 20      6 索引的描述
        // < 10  时    7 索引的描述

        if (remainBoold > 90) {   //后面&&之后可写可不写,程序会自主判断,写上之后可以增加程序员之间的阅读性
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBoold > 80 && remainBoold <= 90) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBoold > 70 && remainBoold <= 80) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBoold > 60 && remainBoold <= 70) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBoold > 40 && remainBoold <= 60) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBoold > 20 && remainBoold <= 40) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (remainBoold > 10 && remainBoold <= 20) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();

        /*//this表示方法的调用者
        System.out.println(this.getName() + "举起拳头打了" + role.getName() +
                "一下，造成了" + hurt + "点伤害，" + role.getName() + "还剩下" +
                remainBoold + "点血量");*/
    }


    public void showRoleInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getGender());
        System.out.println("长相为:" + getFace());
    }
}
