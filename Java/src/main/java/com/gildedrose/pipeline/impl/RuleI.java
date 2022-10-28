package com.gildedrose.pipeline.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.pipeline.Rule;

/**
 * 特殊规则:萨弗拉斯—炎魔拉格纳罗斯之手 永不过期,quality = 80
 *
 * 规则码: i
 */
public class RuleI extends Rule {

    @Override
    public String getRuleName() {
        return "i";
    }

    @Override
    public void handle(Item item) {
        item.sellIn = item.sellIn;
        item.quality = 80;
        next(item);
    }

}
