package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则:sellIn in(0,5] quality + 3
 *
 * 规则码: g
 */
public class RuleG extends Rule {


    @Override
    public String getRuleName() {
        return "g";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        if (sellIn > 0 && sellIn <= 5) {
            item.quality = item.quality + 3;
        }
        next(item);
    }
}
