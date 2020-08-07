package com.example.service;

import com.example.entity.TBkBook;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.TBkBookDto;

import java.util.List;

/**
 * <p>
 * 图书 服务类
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
public interface ITBkBookService {
    List<TBkBookDto> queryBook();
}
