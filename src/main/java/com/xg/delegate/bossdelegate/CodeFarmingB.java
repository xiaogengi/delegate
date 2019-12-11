package com.xg.delegate.bossdelegate;

// 员工B
public class CodeFarmingB implements ICodeFarming{


    @Override
    public void coding(String code) {
        System.out.println("B员工：我在crud");
    }
}
