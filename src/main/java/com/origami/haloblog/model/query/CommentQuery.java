package com.origami.haloblog.model.query;

import com.origami.haloblog.model.enums.CommentStatus;
import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 17:01
 * @description 评论的查询条件
 */
@Data
public class CommentQuery {
    /**
     * Keyword.
     */
    private String keyword;

    /**
     * Comment status.
     */
    private CommentStatus status;
}
