package com.origami.haloblog.model.query;

import com.origami.haloblog.model.enums.OptionType;
import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 17:03
 * @description Option的条件查询
 */

@Data
public class OptionQuery {
    private String keyword;

    private OptionType type;
}
