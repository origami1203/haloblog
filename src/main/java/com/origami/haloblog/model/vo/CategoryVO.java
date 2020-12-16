package com.origami.haloblog.model.vo;

import com.origami.haloblog.model.dto.CategoryDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author origami1203
 * @date 2020-12-16 20:18
 * @description CategoryVO
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class CategoryVO extends CategoryDTO {
    private List<CategoryVO> children;
}
