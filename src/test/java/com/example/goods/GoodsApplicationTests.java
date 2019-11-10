package com.example.goods;

import com.example.goods.service.GoodsService;
import com.example.goods.service.Impl.goodMapperImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsApplicationTests {

    @Autowired
    private GoodsService s;

    @Test
    public void contextLoads() {
        s.findGood(1,null).forEach(System.out::println);
    }

}
