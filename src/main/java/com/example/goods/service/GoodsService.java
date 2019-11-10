package com.example.goods.service;

import com.example.goods.domain.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GoodsService {
    List<Goods> findGood(Integer id,Integer district);
    int update(Goods goods);
}
