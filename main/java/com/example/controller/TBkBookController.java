package com.example.controller;


import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.example.entity.TBkBook;
import com.example.entity.TBkBookDto;
import com.example.service.ITBkBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 图书 前端控制器
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Controller
@RequestMapping("/tBkBook")
public class TBkBookController {

    @Autowired
    private ITBkBookService itBkBookService;

    @RequestMapping(value = {"show"})
    @ResponseBody
    public List<TBkBookDto> queryBook(){
        List<TBkBookDto> list = itBkBookService.queryBook();
   //     System.out.println(list);
        return list;
    }
}
