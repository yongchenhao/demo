package com.example.mapper;

import com.example.entity.TBkBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.TBkBookDto;
import com.example.entity.TBkQuizQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 图书 Mapper 接口
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Repository
public interface TBkBookMapper extends BaseMapper<TBkBook> {

    List<TBkBookDto> queryBook();

    List<TBkQuizQuestion> quertBookQuiz(String id);
}
