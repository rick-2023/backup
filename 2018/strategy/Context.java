package com.zrfan.springboot2.test.strategy;

public class Context {

    private Strategy strategy;

    public double calStrategy(Double charge,Integer type){
        strategy = StrategyFactory.getInstance().create(type);
        return  strategy.calRecharge(charge,RechargeTypeEnum.valueOf(type));

    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
