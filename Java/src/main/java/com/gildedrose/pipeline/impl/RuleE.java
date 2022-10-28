package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: sellIn = 0 quality = 0
 * <p>
 * 规则码:e
 */
public class RuleE extends Rule {

    @Override
    public String getRuleName() {
        return "e";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        if (sellIn == 0) {
            item.quality = 0;
        }

        next(item);
    }
}
