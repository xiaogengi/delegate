package com.xg.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChannelStrategy {


    public static Map<String ,IChannel> CHANNEL_MAP = new ConcurrentHashMap<>();

    static {
        CHANNEL_MAP.put("u51", new U51Bank());
        CHANNEL_MAP.put("u61",new U61Bank());
    }


    public static IChannel getChannelByKey(String key){
        return CHANNEL_MAP.get(key);
    }


}
