package com.gildedrose.utils;

import com.gildedrose.pipeline.*;
import com.gildedrose.pipeline.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 规则工具类
 */
public class RuleUtils {

    private static Map<String, Rule> map = new HashMap<>(16);

    static {
        //todo优化: 和spring结合,可以利用getBean的方式实现

        //sellIn > 0 quality - 1
        map.put("a", new RuleA());

        //sellIn = 0 quality - 2
        map.put("b", new RuleB());

        //sellIn > 0 quality - 2
        map.put("c", new RuleC());

        //sellIn = 0 quality - 4
        map.put("d", new RuleD());

        //sellIn = 0 quality = 0
        map.put("e", new RuleE());

        //sellIn in(5,10] quality + 2
        map.put("f", new RuleF());

        //sellIn in(0,5] quality + 3
        map.put("g", new RuleG());

        //quality = 50 不变了
        map.put("h", new RuleH());

        //萨弗拉斯—炎魔拉格纳罗斯之手 永不过期
        map.put("i", new RuleI());

        //sellIn - 1 等于0时,不减了
        map.put("j", new RuleJ());

        //quality = 0 ,就不变了
        map.put("k", new RuleK());

        //sellIn > 10,quality + 1
        map.put("l", new RuleL());
    }

    /**
     * 简单的解析规则
     * 如: 给:a,b,c 返回 规则a,pipeline模式
     */
    public static Rule parse(String ruleStr) {
        if (ruleStr == null || ruleStr.equals("") || ruleStr.length() == 0) {
            return null;
        }
        String[] split = ruleStr.split(",");

        //头节点
        Rule head = null;

        //倒着循环,便于形成链
        for (int i = split.length - 1; i >= 0; i--) {
            Rule rule = map.get(split[i]);
            if (rule == null) {
                break;
            }
            rule.setRule(head);
            head = rule;
        }
        return head;
    }
}
