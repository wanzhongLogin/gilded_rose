package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: sellIn > 0 quality - 2
 *
 * 规则码: c
 */
public class RuleC extends Rule {


    @Override
    public String getRuleName() {
        return "c";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        if (sellIn > 0) {
            item.quality = item.quality - 2;
        }

        next(item);
    }
}
