package com.xg.delegate.bossdelegate;

// 员工A
public class CodeFarmingA implements ICodeFarming {
    @Override
    public void coding(String code) {
        System.out.println("A员工： 我在搭框架");
    }
}
