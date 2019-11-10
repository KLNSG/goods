package com.example.goods.dao;

import com.example.goods.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> findGoods(@Param("id") Integer id,@Param("district")Integer district);
    int update(Goods goods);
}
