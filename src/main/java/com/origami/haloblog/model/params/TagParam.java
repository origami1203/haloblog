package com.origami.haloblog.model.params;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Tag;
import com.origami.haloblog.utils.SlugUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 21:36
 * @description TagParam
 */
public class TagParam implements DTOToEntity<Tag> {
    @NotBlank(message = "标签名称不能为空")
    @Size(max = 255, message = "标签名称的字符长度不能超过 {max}")
    private String name;

    @Size(max = 255, message = "标签别名的字符长度不能超过 {max}")
    private String slug;

    @Size(max = 1023, message = "封面图链接的字符长度不能超过 {max}")
    private String thumbnail;

    @Override
    public Tag convertTo() {

        slug = StringUtils.isBlank(slug) ? SlugUtils.slug(name) : SlugUtils.slug(slug);

        if (null == thumbnail) {
            thumbnail = "";
        }

        return DTOToEntity.super.convertTo();
    }

    @Override
    public void update(Tag tag) {

        slug = StringUtils.isBlank(slug) ? SlugUtils.slug(name) : SlugUtils.slug(slug);

        if (null == thumbnail) {
            thumbnail = "";
        }

        DTOToEntity.super.update(tag);
    }
}
