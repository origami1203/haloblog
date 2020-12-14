package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Journal;
import com.origami.haloblog.model.enums.JournalType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 19:43
 * @description Journal的验证参数
 */

@Data
public class JournalParam implements DTOToEntity<Journal> {

    @NotBlank(message = "内容不能为空")
    @Size(max = 511, message = "内容的字符长度不能超过 {max}")
    private String sourceContent;

    private JournalType type = JournalType.PUBLIC;

}
