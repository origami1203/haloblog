package com.origami.haloblog.model.query;

import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 17:04
 * @description Photo的条件查询
 */
@Data
public class PhotoQuery {
    /**
     * Keyword.
     */
    private String keyword;

    private String team;
}
