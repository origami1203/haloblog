package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Link;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 19:45
 * @description LinkParam
 */

@Data
public class LinkParam implements DTOToEntity<Link> {
    @NotBlank(message = "友情链接名称不能为空")
    @Size(max = 255, message = "友情链接名称的字符长度不能超过 {max}")
    private String name;

    @NotBlank(message = "友情链接地址不能为空")
    @Size(max = 1023, message = "友情链接地址的字符长度不能超过 {max}")
    @URL(message = "友情链接地址格式不正确")
    private String url;

    @Size(max = 1023, message = "友情链接 Logo 的字符长度不能超过 {max}")
    private String logo;

    @Size(max = 255, message = "友情链接描述的字符长度不能超过 {max}")
    private String description;

    @Size(max = 255, message = "友情链接分组的字符长度 {max}")
    private String team;

    @Min(value = 0, message = "排序编号不能低于 {value}")
    private Integer priority;
}
