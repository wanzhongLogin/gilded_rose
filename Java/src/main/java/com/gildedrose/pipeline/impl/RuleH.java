package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: quality = 50 不变了
 *
 * 规则码: h
 */
public class RuleH extends Rule {


    @Override
    public String getRuleName() {
        return "h";
    }

    @Override
    public void handle(Item item) {
        int quality = item.quality;
        if (quality >= 50) {
            item.quality = 50;
        }

        next(item);
    }
}
