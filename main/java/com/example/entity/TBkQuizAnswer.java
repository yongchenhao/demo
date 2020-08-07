package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 书 书单测试题目备选答案库
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TBkQuizAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 题目id
     */
    private String questionId;

    /**
     * 答案内容
     */
    private String answerContent;

    /**
     * RADIO_0:不是,1:是
     */
    private Integer isRight;

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
