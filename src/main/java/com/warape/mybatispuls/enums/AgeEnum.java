package com.warape.mybatispuls.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum AgeEnum implements IEnum<Integer> {
    ONE(1, "一岁"),
    TWO(2, "二岁"),
    THREE(3, "三岁");

    AgeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    private int value;
    private String desc;
    
    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.desc;
    }
}