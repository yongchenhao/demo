package com.example.service.impl;

import com.example.entity.TBkBook;
import com.example.entity.TBkBookDto;
import com.example.entity.TBkQuizQuestion;
import com.example.entity.TDictGenre;
import com.example.mapper.TBkBookMapper;
import com.example.mapper.TDictGenreMapper;
import com.example.service.ITBkBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 图书 服务实现类
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Service
public class TBkBookServiceImpl implements ITBkBookService {

    @Autowired
    private TBkBookMapper tBkBookMapper;
    @Override
    public List<TBkBookDto> queryBook() {
        List<TBkBookDto> tBkBooks = tBkBookMapper.queryBook();
        for (TBkBookDto tBook:tBkBooks) {
            List<TBkQuizQuestion> tBkQuizQuestions = tBkBookMapper.quertBookQuiz(tBook.getId());
            tBook.setTBkQuizQuestions(tBkQuizQuestions);
        }
        return tBkBooks;
    }
}
