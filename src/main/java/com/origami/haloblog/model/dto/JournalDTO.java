package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Journal;
import com.origami.haloblog.model.enums.JournalType;
import lombok.Data;

import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-13 18:47
 * @description TODO
 */

@Data
public class JournalDTO implements EntityToDTO<JournalDTO, Journal> {
    private Integer id;

    private String sourceContent;

    private String content;

    private Long likes;

    private Date createTime;

    private JournalType type;
}
