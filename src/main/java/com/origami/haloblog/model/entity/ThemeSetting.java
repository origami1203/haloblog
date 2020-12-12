package com.origami.haloblog.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * 主题
 *
 * @author origami1203
 * @date 2020-12-11 14:03
 */
@Data
@Entity
@Table(name = "theme_setting")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ThemeSetting extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设置的键名
     */
    @Column(name = "setting_key", nullable = false)
    private String key;

    /**
     * 键名对应的值
     */
    @Column(name = "setting_value", nullable = false)
    @Lob
    private String value;

    /**
     * 主题的id
     */
    @Column(name = "theme_id", nullable = false)
    private String themeId;
}
