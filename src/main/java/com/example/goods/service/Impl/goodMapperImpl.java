package com.example.goods.service.Impl;

import com.example.goods.dao.GoodsMapper;
import com.example.goods.domain.Goods;
import com.example.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class goodMapperImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findGood(Integer id,Integer district) {
        return goodsMapper.findGoods(id,district);
    }

    @Override
    @Transactional
    public int update(Goods goods) {
        return goodsMapper.update(goods);
    }
}
