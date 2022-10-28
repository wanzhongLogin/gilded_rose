package com.gildedrose.strategy.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.enums.ItemEnum;
import com.gildedrose.pipeline.Rule;
import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.utils.RuleUtils;

/**
 * 普通类型处理模式
 */
public class NormalStrategy extends ItemStrategy {

    @Override
    public String name() {
        return "normal";
    }

    @Override
    public String handle(Item item) {
        try {
            ItemEnum itemByName = ItemEnum.getItemByName(this.name());
            Rule rule = RuleUtils.parse(itemByName.getRule());
            rule.handle(item);
        } catch (Exception e) {
            return "normal --> 处理失败";
        }
        return "normal --> 处理成功";
    }
}
