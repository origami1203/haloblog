package com.origami.haloblog.model.query;

import com.origami.haloblog.model.enums.AttachmentType;
import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 16:58
 * @description 附件的查询参数
 */

@Data
public class AttachmentQuery {
    /**
     * Keyword.
     */
    private String keyword;

    private String mediaType;

    private AttachmentType attachmentType;
}
