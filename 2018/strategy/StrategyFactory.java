package com.zrfan.springboot2.test.strategy;


import java.util.HashMap;

public class StrategyFactory {

    private static StrategyFactory factory = new StrategyFactory();

    private StrategyFactory(){
    }


    private static HashMap<Integer, Strategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.value(),new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.value(),new BusiAcctStrategy());
    }

    public Strategy create(Integer type){
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance(){
        return factory;
    }

}
