package com.warape.mybatispuls;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.warape.mybatispuls.dto.User;
import com.warape.mybatispuls.services.CommodityService;
import com.warape.mybatispuls.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPulsApplicationTests {


    @Autowired
    private CommodityService commodityService;
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test01(){
        IPage<User> iPage = new Page<>();
        iPage.setSize(5);
        iPage.setPages(1);
        IPage<User> page = userService.page(iPage);
        System.out.println(JSON.toJSONString(page));
    }


    @Test
    public void test02(){
        List<User> list = userService.list();

        System.out.println("list = " + list);
    }

    @Test
    public void test03(){

        Object byId = commodityService.getById(1);
        System.out.println("byId = " + byId);
    }

    @Test
    public void test04(){
        boolean b = userService.removeById(1);
        System.out.println("b = " + b);


    }


}
