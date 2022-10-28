package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则1: sellIn > 0 quality - 1
 *
 * 规则码: a
 */
public class RuleA extends Rule {


    @Override
    public String getRuleName() {
        return "a";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        int quality = item.quality;

        if(sellIn > 0){
            item.quality = quality - 1;
        }

        next(item);
    }
}
