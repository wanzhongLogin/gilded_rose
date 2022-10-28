package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: quality = 0 ,就不变了
 * 规则码:k
 */
public class RuleK extends Rule {

    @Override
    public String getRuleName() {
        return "k";
    }

    @Override
    public void handle(Item item) {
        int quality = item.quality;
        if (quality <= 0) {
            item.quality = 0;
        }

        next(item);
    }
}
