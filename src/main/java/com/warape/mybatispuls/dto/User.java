package com.warape.mybatispuls.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonValue;
import com.warape.mybatispuls.enums.AgeEnum;
import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    @JsonValue
    @JSONField(serialzeFeatures= SerializerFeature.WriteEnumUsingToString)
    private AgeEnum age;
    private String email;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer state;
}