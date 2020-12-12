package com.origami.haloblog.model.enums;

/**
 * @author origami1203
 * @date 2020-12-09 20:24
 * @description 评论的审核状态
 */

public enum CommentStatus {

    /**
     * 已发布
     */
    PUBLISHED(0),
    /**
     * 待审核状态
     */
    AUDITING(1),
    /**
     * 回收站
     */
    RECYCLE(2);


    CommentStatus(int anInt) {
    }

}
