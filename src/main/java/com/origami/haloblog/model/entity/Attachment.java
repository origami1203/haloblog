package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.enums.AttachmentType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author origami1203
 * @date 2020-12-9 20:56
 * @description 附件
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Attachment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 附件名称
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 附件访问地址
     */
    @Column(name = "path", length = 1023, nullable = false)
    private String path;

    /**
     * File key: oss存储的键 (Just for deleting)
     */
    @Column(name = "file_key", length = 2047)
    private String fileKey;

    /**
     * 缩略图访问路径
     */
    @Column(name = "thumb_path", length = 1023)
    private String thumbPath;

    /**
     * 附件的文件类型
     */
    @Column(name = "media_type", length = 127, nullable = false)
    private String mediaType;

    /**
     * 附件的拓展名
     */
    @Column(name = "suffix", length = 50)
    private String suffix;

    /**
     * 宽度
     */
    @Column(name = "width")
    @ColumnDefault("0")
    private Integer width;

    /**
     * 高度
     */
    @Column(name = "height")
    @ColumnDefault("0")
    private Integer height;

    /**
     * 附件大小
     */
    @Column(name = "size", nullable = false)
    private Long size;

    /**
     * 上传类型,LOCAL,UPYUN or QNYUN.
     */
    @Column(name = "type")
    @ColumnDefault("0")
    private AttachmentType type;
}
