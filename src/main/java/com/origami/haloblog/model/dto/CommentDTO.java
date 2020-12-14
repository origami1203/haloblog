package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Comment;
import com.origami.haloblog.model.enums.CommentStatus;
import lombok.Data;

import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-13 18:43
 * @description TODO
 */

@Data
public class CommentDTO implements EntityToDTO<CommentDTO, Comment> {
    private Long id;

    private String author;

    private String email;

    private String ipAddress;

    private String authorUrl;

    private String gravatarMd5;

    private String content;

    private CommentStatus status;

    private String userAgent;

    private Long parentId;

    private Boolean isAdmin;

    private Boolean allowNotification;

    private Date createTime;
}
