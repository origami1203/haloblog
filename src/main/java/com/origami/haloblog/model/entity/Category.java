package com.origami.haloblog.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author origami1203
 * @date 2020-12-09 17:12
 * @description 文章的分类
 */

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "category")
public class Category extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类的名字
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * url中该分类显示的名称
     */
    @Column(name = "slug", unique = true)
    private String slug;

    /**
     * 关于分类的描述,不填写为空
     */
    @Column(name = "description", length = 100)
    private String description = "";

    /**
     * 缩略图
     */
    @Column(name = "thumbnail")
    private String thumbnail;

    /**
     * 所属的父类分类,默认为0,即没有
     */
    @Column(name = "parent_id")
    private Integer parentId = 0;

}
