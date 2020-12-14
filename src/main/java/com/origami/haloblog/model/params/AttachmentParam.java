package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Attachment;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-11 14:22
 * @description Attachment的验证参数
 */
@Data
public class AttachmentParam implements DTOToEntity<Attachment> {

    @NotBlank(message = "附件名不能为空")
    @Size(max = 255,message = "附件名称的字符长度不能超过 {max}")
    private String name;

}
