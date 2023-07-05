package com.qianrui.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //牌盒Map
    //此时我们只要把牌跟序号产生对应关系就可以了,不需要按照序号进行排序,所以只要HashMap即可
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        //序号
        int serialNumber = 1;
        for (String n : number) {
            //c:依次表示每一个花色
            for (String c : color) {
                //n:依次表示每一个数字
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }

        hm.put(serialNumber, "joker");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "JOKER");
        list.add(serialNumber);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的索引
            int serialNumber = list.get(i);

            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }

            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }

        //看牌
        lookPoker("底牌", lord);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    /**
     * @param name 玩家名称
     * @param ts   牌的序号
     */
    public void lookPoker(String name, TreeSet<Integer> ts) {

        System.out.print(name + ": ");

        //遍历TreeSet集合得到每一个序号,再拿着序号到Map集合中寻找真正的牌
        for (int serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
