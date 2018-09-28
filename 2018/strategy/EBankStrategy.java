package com.zrfan.springboot2.test.strategy;

public class EBankStrategy implements Strategy {
    @Override
    public double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum) {
        return 0.85*charge;
    }
}
