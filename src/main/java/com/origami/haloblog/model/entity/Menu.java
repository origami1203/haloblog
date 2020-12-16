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

/**
 * @author origami1203
 * @date 2020-12-10 15:55
 * @description TODO
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Menu extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单名
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * 菜单访问地址
     */
    @Column(name = "url", length = 1023, nullable = false)
    private String url;

    /**
     * 优先级
     */
    @Column(name = "priority")
    @ColumnDefault("0")
    private Integer priority;

    /**
     * 新页面打开方式
     */
    @Column(name = "target", length = 20)
    @ColumnDefault("'_self'")
    private String target;

    /**
     * 菜单图标,Template support required.
     */
    @Column(name = "icon", length = 50)
    private String icon = "";

    /**
     * 父菜单
     */
    @Column(name = "parent_id")
    @ColumnDefault("0")
    private Integer parentId;

    /**
     * 菜单组名
     */
    @Column(name = "team")
    private String team;
}
