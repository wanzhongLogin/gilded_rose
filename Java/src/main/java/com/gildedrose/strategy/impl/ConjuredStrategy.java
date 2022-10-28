package com.gildedrose.strategy.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.enums.ItemEnum;
import com.gildedrose.pipeline.Rule;
import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.utils.RuleUtils;

/**
 * 召唤物品
 *
 * 下降速度比正常物品快一倍
 *
 */
public class ConjuredStrategy extends ItemStrategy {

    @Override
    public String name() {
        return "Conjured";
    }

    @Override
    public String handle(Item item) {
        try {
            ItemEnum itemByName = ItemEnum.getItemByName(this.name());
            Rule rule = RuleUtils.parse(itemByName.getRule());
            rule.handle(item);
        } catch (Exception e) {
            return "Conjured --> 处理失败";
        }
        return "Conjured --> 处理成功";
    }
}
