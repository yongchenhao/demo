package com.example.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 字典 体裁类别表
 * </p>
 *
 * @author zxj
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TDictGenre implements Serializable {

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
     * 图标
     */
    private String icon;

    /**
     * RADIO_1:基础类,2:个性类
     */
    private Integer btype;

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

    /**
     * 编码，唯一
     */
    private String idcode;


}
