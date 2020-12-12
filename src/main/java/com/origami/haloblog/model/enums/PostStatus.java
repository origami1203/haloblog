package com.origami.haloblog.model.enums;

/**
 * @author origami1203
 * @date 2020-12-10 14:55
 * @description 帖子的发布状态
 */

public enum PostStatus {
    /**
     * 已发布
     */
    PUBLISHED(0),

    /**
     * 草稿
     */
    DRAFT(1),

    /**
     * 回收站
     */
    RECYCLE(2),

    /**
     * 私密
     */
    INTIMATE(3);

    PostStatus(int value) {
    }
}
