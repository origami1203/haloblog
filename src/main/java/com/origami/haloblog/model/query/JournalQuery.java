package com.origami.haloblog.model.query;

import com.origami.haloblog.model.enums.JournalType;
import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 17:02
 * @description Journal的条件查询
 */
@Data
public class JournalQuery {
    /**
     * Keyword.
     */
    private String keyword;

    private JournalType type;
}
