package com.origami.haloblog.model.enums;

/**
 * @author origami1203
 * @date 2020-12-10 15:11
 * @description 日志类型
 */
public enum JournalType {

    /**
     * 发布状态
     */
    PUBLIC(1),

    /**
     * 私密
     */
    INTIMATE(0);

    JournalType(int value) {
    }

}
