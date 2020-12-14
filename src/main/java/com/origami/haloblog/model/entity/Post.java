package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.enums.PostEditorType;
import com.origami.haloblog.model.enums.PostStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-10 14:51
 * @description 帖子
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER, columnDefinition = "int default 0")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 帖子标题
     */
    @Column(name = "title", nullable = false)
    private String title;

    /**
     * 帖子状态
     */
    @Column(name = "status")
    @ColumnDefault("1")
    private PostStatus status;

    /**
     * 帖子url.
     */
    @Deprecated
    @Column(name = "url")
    private String url;

    /**
     * 帖子的url名字
     */
    @Column(name = "slug", unique = true)
    private String slug;

    /**
     * 编辑器类型
     */
    @Column(name = "editor_type")
    @ColumnDefault("0")
    private PostEditorType editorType;

    /**
     * 原始化的内容
     */
    @Column(name = "original_content", nullable = false)
    @Lob
    private String originalContent;

    /**
     * 格式化后的内容
     */
    @Column(name = "format_content")
    @Lob
    private String formatContent;

    /**
     * 摘要
     */
    @Column(name = "summary")
    @Lob
    private String summary;

    /**
     * 缩略图
     */
    @Column(name = "thumbnail", length = 1023)
    private String thumbnail;

    /**
     * 访问数
     */
    @Column(name = "visits")
    @ColumnDefault("0")
    private Long visits;

    /**
     * 是否允许评论
     */
    @Column(name = "disallow_comment")
    @ColumnDefault("0")
    private Boolean disallowComment;

    /**
     * 设置访问密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 自定义模版
     */
    @Column(name = "template")
    private String template;

    /**
     * 帖子置顶
     */
    @Column(name = "top_priority")
    @ColumnDefault("0")
    private Integer topPriority;

    /**
     * Likes数目
     */
    @Column(name = "likes")
    @ColumnDefault("0")
    private Long likes;

    /**
     * 编辑时间
     */
    @Column(name = "edit_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editTime;

    /**
     * 元数据
     */
    @Column(name = "meta_keywords", length = 511)
    private String metaKeywords;

    /**
     * 元数据描述
     */
    @Column(name = "meta_description", length = 1023)
    private String metaDescription;

    /**
     * 字数
     */
    @Column(name = "word_count")
    @ColumnDefault("0")
    private Long wordCount;
}
