package com.origami.haloblog.model.enums;

/**
 * @author origami1203
 * @date 2020-12-10 14:59
 * @description 帖子的编辑类型
 */
public enum PostEditorType {
    /**
     * Markdown
     */
    MARKDOWN(0),

    /**
     * 富文本编辑器
     */
    RICHTEXT(1);

    PostEditorType(Integer value) {
    }

}
