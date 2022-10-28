package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: sellIn = 0 quality - 4
 *
 * 规则码: d
 */
public class RuleD extends Rule {


    @Override
    public String getRuleName() {
        return "d";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        int quality = item.quality;
        if (sellIn == 0) {
            item.quality = quality - 4;
        }

        next(item);
    }
}
