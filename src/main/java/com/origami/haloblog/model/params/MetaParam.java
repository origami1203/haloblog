package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Meta;
import com.origami.haloblog.utils.BeanUtils;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.lang.reflect.ParameterizedType;

/**
 * @author origami1203
 * @date 2020-12-13 9:26
 * @description MetaParam
 */

@Data
public abstract class MetaParam<Meta> implements DTOToEntity<Meta> {
    @NotBlank(message = "文章 id 不能为空")
    private Integer postId;

    @NotBlank(message = "Meta key 不能为空")
    @Size(max = 1023, message = "Meta key 的字符长度不能超过 {max}")
    private String key;

    @NotBlank(message = "Meta value 不能为空")
    @Size(max = 1023, message = "Meta value 的字符长度不能超过 {max}")
    private String value;

    @Override
    public ParameterizedType getParameterizedType() {
        return BeanUtils.getParameterizedType(MetaParam.class, this.getClass().getSuperclass());
    }
}
