package com.gildedrose.strategy.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.enums.ItemEnum;
import com.gildedrose.pipeline.Rule;
import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.utils.RuleUtils;

/**
 * 陈年布利奶酪处理
 */
public class AgedBrieStrategy extends ItemStrategy {

    @Override
    public String name() {
        return "Aged Brie";
    }

    @Override
    public String handle(Item item) {
        try {
            ItemEnum itemByName = ItemEnum.getItemByName(this.name());
            Rule rule = RuleUtils.parse(itemByName.getRule());
            rule.handle(item);
        } catch (Exception e) {
            return "Aged Brie --> 处理失败";
        }
        return "Aged Brie --> 处理成功";
    }

}
