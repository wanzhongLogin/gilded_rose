package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则:sellIn in(5,10] quality + 2
 *
 * 规则码: f
 */
public class RuleF extends Rule {


    @Override
    public String getRuleName() {
        return "f";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        if (sellIn > 5 && sellIn <= 10) {
            item.quality = item.quality + 2;
        }

        next(item);
    }
}
