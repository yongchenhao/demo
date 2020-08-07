package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 字典 名家讲堂课类别表
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TDictLecture implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * RADIO_0:停用,1:启用
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


}
