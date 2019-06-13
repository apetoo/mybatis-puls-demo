package com.warape.mybatispuls.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.warape.mybatispuls.dto.Commodity;
import com.warape.mybatispuls.mapper.CommodityMapper;
import com.warape.mybatispuls.services.CommodityService;
import org.springframework.stereotype.Service;

/**
 * IService 实现类（ 泛型：M 是 mapper 对象，T 是实体 ， PK 是主键泛型 ）
 * @program: mybatis-puls
 * @description:
 * @author: 万明宇 (warApe)
 * @create: 2019-06-13 09:43
 **/
@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {
}
