package com.qianrui.a05interfacedemo5;

public class PingPongSporter extends Sporter implements English{
    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员要说英语");
    }
}
