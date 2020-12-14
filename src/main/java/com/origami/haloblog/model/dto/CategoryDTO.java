package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Category;
import lombok.Data;

import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-13 18:46
 * @description TODO
 */

@Data
public class CategoryDTO implements EntityToDTO<CategoryDTO, Category> {

    private Integer id;

    private String name;

    private String slug;

    private String description;

    private String thumbnail;

    private Integer parentId;

    private Date createTime;

    private String fullPath;
}
