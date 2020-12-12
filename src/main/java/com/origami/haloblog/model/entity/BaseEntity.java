package com.origami.haloblog.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-09 16:20
 * @description 基类,继承此类为所有的bean增加create_time和update_time
 */

@Data
@MappedSuperclass
public class BaseEntity {

    /**
     * 插入时填入插入时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 自动填充更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
