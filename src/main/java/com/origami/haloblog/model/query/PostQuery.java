package com.origami.haloblog.model.query;

import com.origami.haloblog.model.enums.PostStatus;
import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 17:05
 * @description Post的条件查询
 */
@Data
public class PostQuery {
    /**
     * Keyword.
     */
    private String keyword;

    /**
     * Post status.
     */
    private PostStatus status;

    /**
     * Category id.
     */
    private Integer categoryId;
}
