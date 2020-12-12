package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-10 13:38
 * @description 图库
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "photo")
public class Photo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 图片名字
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 图片描述
     */
    @Column(name = "description")
    private String description = "";

    /**
     * 拍摄时间 / 创建时间
     */
    @Column(name = "take_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date takeTime = getCreateTime();

    /**
     * 图片定位
     */
    @Column(name = "location")
    private String location = "";

    /**
     * 缩略图
     */
    @Column(name = "thumbnail", length = 1023)
    private String thumbnail = "";

    /**
     * 访问路径
     */
    @Column(name = "url", length = 1023, nullable = false)
    private String url;

    /**
     * 组名
     */
    @Column(name = "team")
    private String team = "";


}
