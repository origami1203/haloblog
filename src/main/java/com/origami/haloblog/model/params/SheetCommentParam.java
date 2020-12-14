package com.origami.haloblog.model.params;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author origami1203
 * @date 2020-12-13 16:44
 * @description SheetCommentParam
 */

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class SheetCommentParam extends CommentParam<SheetParam> {
}
