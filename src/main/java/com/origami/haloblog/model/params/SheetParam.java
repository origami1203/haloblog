package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Sheet;
import com.origami.haloblog.model.entity.SheetMeta;
import com.origami.haloblog.model.enums.PostEditorType;
import com.origami.haloblog.model.enums.PostStatus;
import com.origami.haloblog.utils.SlugUtils;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author origami1203
 * @date 2020-12-13 8:26
 * @description SheetParam
 */

@Data
public class SheetParam implements DTOToEntity<Sheet> {
    @NotBlank(message = "页面标题不能为空")
    @Size(max = 100, message = "页面标题的字符长度不能超过 {max}")
    private String title;

    private PostStatus status = PostStatus.DRAFT;

    @Size(max = 255, message = "页面别名的字符长度不能超过 {max}")
    private String slug;

    private PostEditorType editorType;

    private String originalContent;

    private String summary;

    @Size(max = 255, message = "封面图链接的字符长度不能超过 {max}")
    private String thumbnail;

    private Boolean disallowComment = false;

    @Size(max = 255, message = "页面密码的字符长度不能超过 {max}")
    private String password;

    @Size(max = 255, message = "Length of template must not be more than {max}")
    private String template;

    @Min(value = 0, message = "Post top priority must not be less than {value}")
    private Integer topPriority = 0;

    private Date createTime;

    private String metaKeywords;

    private String metaDescription;

    private Set<SheetMetaParam> metas;

    @Override
    public Sheet convertTo() {
        slug = StringUtils.isBlank(slug) ? SlugUtils.slug(title) : SlugUtils.slug(slug);

        if (null == thumbnail) {
            thumbnail = "";
        }

        if (null == editorType) {
            editorType = PostEditorType.MARKDOWN;
        }

        return DTOToEntity.super.convertTo();
    }

    @Override
    public void update(Sheet sheet) {
        slug = StringUtils.isBlank(slug) ? SlugUtils.slug(title) : SlugUtils.slug(slug);

        if (null == thumbnail) {
            thumbnail = "";
        }

        if (null == editorType) {
            editorType = PostEditorType.MARKDOWN;
        }

        DTOToEntity.super.update(sheet);
    }

    public Set<SheetMeta> getSheetMetas() {
        Set<SheetMeta> sheetMetasSet = new HashSet<>();
        if (CollectionUtils.isEmpty(metas)) {
            return sheetMetasSet;
        }

        for (SheetMetaParam sheetMetaParam : metas) {
            SheetMeta sheetMeta = sheetMetaParam.convertTo();
            sheetMetasSet.add(sheetMeta);
        }
        return sheetMetasSet;
    }
}
