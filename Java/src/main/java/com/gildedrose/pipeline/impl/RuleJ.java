package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 规则: sellIn 每天减1 等于0时,不减了 : sellIn - 1 如果 = 0 不变
 *
 * 规则码:j
 */
public class RuleJ extends Rule {


    @Override
    public String getRuleName() {
        return "j";
    }

    @Override
    public void handle(Item item) {
        int sellIn = item.sellIn;
        item.sellIn = item.sellIn - 1;
        if(sellIn <= 0){
            item.sellIn = 0;
        }

        next(item);
    }
}
