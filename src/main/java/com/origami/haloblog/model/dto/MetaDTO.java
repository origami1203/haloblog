package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Meta;
import lombok.Data;

import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-13 18:45
 * @description TODO
 */

@Data
public class MetaDTO implements EntityToDTO<MetaDTO, Meta> {
    private Long id;

    private Integer postId;

    private String key;

    private String value;

    private Date createTime;
}
