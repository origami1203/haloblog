package com.origami.haloblog.model.entity;

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
 * @date 2020-12-10 14:43
 * @description 评论黑名单
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="comment_black_list")
public class CommentBlackList extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_address", length = 127, nullable = false)
    private String ipAddress;

    /**
     * 封禁时间
     */
    @Column(name = "ban_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date banTime;
}
