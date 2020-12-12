package com.origami.haloblog.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author origami1203
 * @date 2020-12-10 15:39
 * @description 友链
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "link")
public class Link extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名字
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 网址
     */
    @Column(name = "url", length = 1023, nullable = false)
    private String url;

    /**
     * logo.
     */
    @Column(name = "logo", length = 1023)
    private String logo;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 组
     */
    @Column(name = "team")
    private String team;

    /**
     * 优先级
     */
    @Column(name = "priority")
    @ColumnDefault("0")
    private Integer priority;

}
