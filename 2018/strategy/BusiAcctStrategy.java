package com.zrfan.springboot2.test.strategy;

public class BusiAcctStrategy implements Strategy {
    @Override
    public double calRecharge(Double charge, RechargeTypeEnum rechargeTypeEnum) {
        return 0.75*charge;
    }
}
