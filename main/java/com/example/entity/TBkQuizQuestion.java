package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 书 书单测试题目库
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TBkQuizQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 书单id
     */
    private String bookId;

    /**
     * 题目
     */
    private String question;

    /**
     * 题目原文，长内容
     */
    private String questionOriginal;

    /**
     * RADIO_1:文字,2:图片,3:图文
     */
    private Integer questionType;

    /**
     * img 题图
     */
    private String questionImage;

    /**
     * 顺序
     */
    private Integer indexs;

    /**
     * 题目解答
     */
    private String questionExplain;

    /**
     * create_by
     */
    private String createBy;

    /**
     * create_date
     */
    private LocalDateTime createDate;

    /**
     * update_by
     */
    private String updateBy;

    /**
     * update_date
     */
    private LocalDateTime updateDate;

    /**
     * 编码，唯一
     */
    private String idcode;


}
