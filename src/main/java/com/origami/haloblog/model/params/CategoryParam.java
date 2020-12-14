package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Category;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 19:10
 * @description Category的验证参数
 */

@Data
public class CategoryParam implements DTOToEntity<Category> {

    @NotBlank(message = "分类名称不能为空")
    @Size(max = 20, message = "分类名称的字符长度不能超过 {max}")
    private String name;

    @Size(max = 20, message = "分类别名的字符长度不能超过 {max}")
    private String slug;

    @Size(max = 100, message = "分类描述的字符长度不能超过 {max}")
    private String description;

    @Size(max = 1023, message = "封面图链接的字符长度不能超过 {max}")
    private String thumbnail;

    private Integer parentId = 0;
}
