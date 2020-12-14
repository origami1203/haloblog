package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Link;
import lombok.Data;

/**
 * @author origami1203
 * @date 2020-12-13 18:49
 * @description TODO
 */

@Data
public class LinkDTO implements EntityToDTO<LinkDTO, Link> {
    private Integer id;

    private String name;

    private String url;

    private String logo;

    private String description;

    private String team;

    private Integer priority;
}
