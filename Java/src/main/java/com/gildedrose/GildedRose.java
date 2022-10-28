package com.gildedrose;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.utils.ItemStrategyUtils;
import com.gildedrose.utils.ThreadPoolItem;
import com.gildedrose.vo.Item;

/**
 * 镶金玫瑰
 */
class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * 新方法
     */
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            ThreadPoolItem.pool.submit(() -> {
                ItemStrategy strategy = ItemStrategyUtils.getItemStrategyByName(item.name);
                String handle = strategy.handle(item);
                System.out.println(handle + "-----" + item.toString());
            });
        }
    }



    public void updateQuality2() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }
            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
