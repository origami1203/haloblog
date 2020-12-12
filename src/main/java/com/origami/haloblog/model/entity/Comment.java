package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.enums.CommentStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

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
 * @date 2020-12-9 19:14
 * @description 评论
 */

@Entity
@Table(name = "comment")
@Data
@EqualsAndHashCode(callSuper = true)
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.INTEGER,columnDefinition = "int default 0")
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 评论人的名字
     */
    @Column(name = "author", nullable = false)
    private String author;

    /**
     * 评论者的网站
     */
    @Column(name = "author_url", length = 511)
    private String authorUrl;

    /**
     * 评论的内容
     */
    @Column(name ="content",nullable = false)
    private String content;

    /**
     * 评论者的邮箱
     */
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * 评论人的ip地址
     */
    @Column(name = "ip_address", length = 127)
    private String ipAddress;

    /**
     * 评论的状态,已发布,待审核,回收站三个状态
     */
    @Column(name = "status")
    @ColumnDefault("1")
    private CommentStatus status;

    /**
     * Gravatar md5
     */
    @Column(name = "gravatar_md5", length = 127)
    private String gravatarMd5;

    /**
     * 浏览器ua
     */
    @Column(name = "user_agent", length = 511)
    private String userAgent;

    /**
     * 是否是管理员
     */
    @Column(name = "is_admin")
    @ColumnDefault("0")
    private Boolean isAdmin;

    /**
     * 允许通知
     */
    @Column(name = "allow_notification")
    @ColumnDefault("1")
    private Boolean allowNotification;

    /**
     * 文章的id
     */
    @Column(name = "post_id", nullable = false)
    private Integer postId;

    /**
     * 评论是否置顶
     */
    @Column(name = "top_priority")
    @ColumnDefault("0")
    private Integer topPriority;

    /**
     * 评论所属的父评论
     */
    @Column(name = "parent_id")
    @ColumnDefault("0")
    private Long parentId;


}
