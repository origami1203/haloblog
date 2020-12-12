package com.origami.haloblog.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author origami1203
 * @date 2020-12-11 13:48
 * @description TODO
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "meta")
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.INTEGER, columnDefinition = "int default 0")
public class Meta extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文章id
     */
    @Column(name = "post_id", nullable = false)
    private Integer postId;

    /**
     * meta 键
     */
    @Column(name = "meta_key", nullable = false)
    private String key;

    /**
     * meta 值
     */
    @Column(name = "meta_value", length = 1023, nullable = false)
    private String value;
}
