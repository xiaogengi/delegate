package com.xg.delegate.bossdelegate;

//经理
public class Mabager implements ICodeFarming {


    @Override
    public void coding(String code) {
        ICodeFarming iCodeFarming = BOSSDelegate.DELEGATE_BOSS.get(code);
        iCodeFarming.coding("");
    }
}
