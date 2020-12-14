package com.origami.haloblog.model.params;

import com.origami.haloblog.model.entity.Meta;
import com.origami.haloblog.model.entity.SheetMeta;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author origami1203
 * @date 2020-12-13 8:31
 * @description SheetMetaParam
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class SheetMetaParam extends MetaParam<SheetMeta> {
}
