package com.gildedrose.pipeline;

import com.gildedrose.vo.Item;

/**
 * 规则
 */
public abstract class Rule {

    public abstract String getRuleName();

    public abstract void handle(Item item);

    private Rule rule;

    public void setRule(Rule rule){
        this.rule = rule;
    }

    public void next(Item item){
        if(rule != null){
            rule.handle(item);
        }
    }

}
