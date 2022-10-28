package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: sellIn = 0 quality - 2
 *
 * 规则码: b
 *
 */
public class RuleB extends Rule {


    @Override
    public String getRuleName() {
        return "b";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        int quality = item.quality;

        if (sellIn == 0) {
            item.quality = quality - 2;
        }

        next(item);
    }
}
