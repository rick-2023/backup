package com.zrfan.springboot2.test.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        double money = context.calStrategy(1.0,1);

        System.out.println(money);
    }
}
