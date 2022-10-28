package com.gildedrose.utils;

import com.gildedrose.enums.ItemEnum;
import com.gildedrose.strategy.*;
import com.gildedrose.strategy.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式工具类
 */
public class ItemStrategyUtils {

    private static Map<String, ItemStrategy> map = new HashMap<>(8);

    static {
        //todo 和spring整合,可以利用getBean的方式来实现
        map.put("Aged Brie", new AgedBrieStrategy());
        map.put("Sulfuras", new SulfurasStrategy());
        map.put("Backstage passes", new BackstagePassedStrategy());
        map.put("normal", new NormalStrategy());
        map.put("Conjured",new ConjuredStrategy());
    }

    public static ItemStrategy getItemStrategyByName(String name){
        ItemStrategy strategy = map.get(name);

        //如果没有,那么返回默认的普通模式
        if(strategy == null){
            strategy = map.get(ItemEnum.NORMAL.getName());
        }

        return strategy;
    }

}
