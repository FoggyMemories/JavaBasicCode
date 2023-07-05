package com.code.apiStringDemo;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }


    //定义一个方法用于攻击别人
    //方法的调用者去攻击参数
    public void attack(Role role) {
        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //修改一下挨揍人的血量
        //剩余血量
        int remainBoold = role.getBlood() - hurt;

        //对剩余血量进行一个验证,如果为负数,就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;

        role.setBlood(remainBoold);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头打了" + role.getName() +
                "一下，造成了" + hurt + "点伤害，" + role.getName() + "还剩下" +
                remainBoold + "点血量");
    }
}
