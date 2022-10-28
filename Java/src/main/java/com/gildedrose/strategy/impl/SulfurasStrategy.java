package com.gildedrose.strategy.impl;

import com.gildedrose.vo.Item;
import com.gildedrose.enums.ItemEnum;
import com.gildedrose.pipeline.Rule;
import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.utils.RuleUtils;

/**
 * 萨弗拉斯—炎魔拉格纳罗斯之手
 *
 * 永不过期 品质不变
 *
 */
public class SulfurasStrategy extends ItemStrategy {

    @Override
    public String name() {
        return "Sulfuras";
    }

    @Override
    public String handle(Item item) {
        try {
            ItemEnum itemByName = ItemEnum.getItemByName(this.name());
            Rule rule = RuleUtils.parse(itemByName.getRule());
            rule.handle(item);
        } catch (Exception e) {
            return "Sulfuras --> 处理失败";
        }
        return "Sulfuras --> 处理成功";
    }

}
