package com.gildedrose;

import com.gildedrose.vo.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void test(){
        Item it1 = new Item("Aged Brie", 13, 30);
        Item it2 = new Item("Sulfuras", 13, 80);
        Item it3 = new Item("Backstage passes", 13, 30);
        Item it4 = new Item("normal", 13, 30);
        Item it5 = new Item("Conjured", 0, 0);

        Item[] items = {it1, it2, it3, it4, it5};
        GildedRose app = new GildedRose(items);

        //模拟100天
        for (int i = 0; i < 30; i++) {
            app.updateQuality();
        }
    }

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality2();
        assertEquals("fixme", app.items[0].name);
    }

}
