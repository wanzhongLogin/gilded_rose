package com.gildedrose.strategy;

import com.gildedrose.vo.Item;

public abstract class ItemStrategy {

    /**
     *  > 1: sellIn > 0 quality - 1  a
     *       sellIn = 0 quality - 2  b
     *
     *  > 2: sellIn = 0 quality - 2  c
     *       sellIn = 0 quality - 4  d
     *
     *  > 3: sellIn = 0 quality = 0  e
     *       sellIn in(5,10] quality + 2  f
     *       sellIn in(0,5] quality + 3   g
     *       sellIn > 10 quality 随着时间增加 + 1  l
     *
     *  > 4: quality = 50 不变 h
     *
     *  > 5: sellIn = 不变 quality = 80不变 i
     *
     *  > 6: sellIn - 1 如果 = 0 不变 j
     *
     *  > 7: quality 如果 = 0 不变 k
     *
     *
     * 	- 一旦销售期限过期，品质`Quality`会以双倍速度加速下降
     *
     * 	- 物品的品质`Quality`永远不会为负值
     *
     * 	- "Aged Brie"（陈年布利奶酪）的品质`Quality`会随着时间推移而提高
     *
     * 	- 物品的品质`Quality`永远不会超过50
     *
     * 	- 传奇物品"Sulfuras"（萨弗拉斯—炎魔拉格纳罗斯之手）永不过期，也不会降低品质`Quality`
     *
     * 	- "Backstage passes"（后台通行证）与"Aged Brie"（陈年布利奶酪）类似，其品质`Quality`会随着时间推移而提高； 当还剩10天或更少的时候，品质`Quality`每天提高2；当还剩5天或更少的时候，品质`Quality`每天提高3； 但一旦过期，品质就会降为0
     *
     * 	- "Conjured"（召唤物品）的品质`Quality`下降速度比正常物品快一倍
     */

    /**
     * 策略模式名称
     */
    public abstract String name();

    /**
     * 处理数据
     */
    public abstract String handle(Item item);

}
