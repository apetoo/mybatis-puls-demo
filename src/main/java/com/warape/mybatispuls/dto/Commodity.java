package com.warape.mybatispuls.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: mybatis-puls
 * @description:
 * @author: 万明宇 (warApe)
 * @create: 2019-06-13 10:08
 **/
@Data
public class Commodity {

    private Integer id;
    private String name;
    private BigDecimal price;


}
