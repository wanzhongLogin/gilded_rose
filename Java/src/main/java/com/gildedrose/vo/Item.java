package com.gildedrose.vo;

/**
 * 物品
 */
public class Item {

    /**
     * 物品名称
     */
    public String name;

    /**
     * 销售期限
     */
    public int sellIn;

    /**
     * 品质
     */
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
