package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: 随着时间增加,品质增加 + 1
 *
 * 规则码: l
 */
public class RuleL extends Rule {

    @Override
    public String getRuleName() {
        return "l";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        if(sellIn > 10){
            item.quality = item.quality + 1;
        }

        next(item);
    }
}
