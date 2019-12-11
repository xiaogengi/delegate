package com.xg.delegate.controllerdelegate;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class DispatcharServer {

    private static Map<String,Class> map = new HashMap();

    static {
        map.put("BankInfo",BankController.class);
        map.put("orderInfo",OrderController.class);
        map.put("SystemInfo",SystemController.class);
    }

    public void doPost(String url){
        Class aClass = map.get(url);
        try {
            Method method = aClass.getMethod(url, null);
            method.invoke(aClass.newInstance(),null);
        } catch (Exception e) {
            e.printStackTrace();
        }


//        if("BankInfo".equals(url)){
//            new BankController().BankInfo();
//        }else if("orderInfo".equals(url)){
//            new OrderController().orderInfo();
//        }else if ("SystemInfo".equals(url)){
//            new SystemController().SystemInfo();
//        }
    }

}
