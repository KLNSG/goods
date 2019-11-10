package com.example.goods.conTroller;

import com.example.goods.domain.Goods;
import com.example.goods.service.GoodsService;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class goodConTroller {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/")
    public String findgood(Model model,Integer id,Integer district){
        List<Goods> s=goodsService.findGood(id,district);
        if (id!=null){
            Goods goods=s.get(0);
            model.addAttribute("goodbyID",goods);
        }else {
            model.addAttribute("goodbyID",null);
        }
        model.addAttribute("AllGood",s);
        return "GoodShow.html";
    }

    @RequestMapping("/update")
    public String update(Goods goods){
        int i=goodsService.update(goods);
        if (i!=0) {
            return "redirect:/";
        }else {
            return "";
        }
    }
}
