package com.xg.delegate.bossdelegate;

import java.util.HashMap;
import java.util.Map;

public class BOSSDelegate {

    public static Map<String,ICodeFarming> DELEGATE_BOSS = new HashMap<String, ICodeFarming>();

    static {
        DELEGATE_BOSS.put("A",new CodeFarmingA());
        DELEGATE_BOSS.put("B",new CodeFarmingB());
    }


}
