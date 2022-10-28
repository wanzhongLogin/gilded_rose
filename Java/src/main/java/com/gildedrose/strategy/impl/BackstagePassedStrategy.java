package com.gildedrose.strategy.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.enums.ItemEnum;
import com.gildedrose.pipeline.Rule;
import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.utils.RuleUtils;

/**
 * 后台通行证
 */
public class BackstagePassedStrategy extends ItemStrategy {

    @Override
    public String name() {
        return "Backstage passes";
    }

    @Override
    public String handle(Item item) {
        try {
            ItemEnum itemByName = ItemEnum.getItemByName(this.name());
            Rule rule = RuleUtils.parse(itemByName.getRule());
            rule.handle(item);
        } catch (Exception e) {
            return "Backstage passes --> 处理失败";
        }
        return "Backstage passes --> 处理成功";
    }
}
