package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 图书
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TBkBook implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 编号
     */
    private String courseNo;

    /**
     * 名称
     */
    private String name;

    /**
     * img 封面图
     */
    private String coverImg;

    /**
     * 分类
     */
    private String typeId;

    /**
     * 体裁
     */
    private String genreId;

    /**
     * 阅读积分
     */
    private Integer readPoints;

    /**
     * BL值
     */
    private BigDecimal blVal;

    /**
     * 作者
     */
    private String author;

    /**
     * 译者
     */
    private String translator;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 总字数
     */
    private Integer total;

    /**
     * 测试题目数
     */
    private Integer quizQuestionTotal;

    /**
     * 认知年级起
     */
    private Integer gradeMin;

    /**
     * 认知年级止
     */
    private Integer gradeMax;

    /**
     * 简介
     */
    private String introduction;

    /**
     * RADIO_0:下架,1:上架
     */
    private Integer status;

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
     * RADIO_PIC:图画书,BRG:桥梁书,PRI:初章书,MID:中章书,CHA:章节书,MHS:漫画书,ZJCT:章节彩图绘本书,WZS:文字书
     */
    private String showType;

    /**
     * 推荐理由
     */
    private String suggestTip;

    /**
     * 编码，唯一
     */
    private String idcode;


}
