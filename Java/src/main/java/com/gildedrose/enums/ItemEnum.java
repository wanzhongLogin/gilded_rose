package com.gildedrose.enums;


/**
 * 物品清单
 */
public enum ItemEnum {

    AGED_BRIE("Aged Brie", "j,l,f,g,h,e,k", "陈年布利奶酪"),

    SULFURAS("Sulfuras", "i", "萨弗拉斯—炎魔拉格纳罗斯之手"),

    BACKSTAGE_PASSED("Backstage passes", "j,l,f,g,h,e,k", "后台通行证"),

    NORMAL("normal", "j,a,b,k", "普通物品"),

    CONJURED("Conjured","j,c,d,k","召唤物品");


    /**
     * 名称
     */
    private String name;

    /**
     * 规则
     */
    private String rule;

    /**
     * 描述
     */
    private String desc;

    ItemEnum(String name, String rule, String desc) {
        this.name = name;
        this.rule = rule;
        this.desc = desc;
    }

    /**
     * 通过物品名称 获取 枚举
     */
    public static ItemEnum getItemByName(String name) {
        for (ItemEnum obj : ItemEnum.values()) {
            if (obj.name.equals(name)) {
                return obj;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public String getRule() {
        return rule;
    }

    public String getDesc() {
        return desc;
    }

}
