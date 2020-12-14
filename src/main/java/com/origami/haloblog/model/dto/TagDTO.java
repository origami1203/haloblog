package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Tag;
import lombok.Data;

import java.util.Date;

/**
 * Tag output dto.
 *
 * @author origami1203
 * @date 2019-03-19
 */
@Data
public class TagDTO implements EntityToDTO<TagDTO, Tag> {

    private Integer id;

    private String name;

    private String slug;

    private String thumbnail;

    private Date createTime;

    private String fullPath;
}
