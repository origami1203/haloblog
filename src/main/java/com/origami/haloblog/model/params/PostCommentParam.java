package com.origami.haloblog.model.params;

import com.origami.haloblog.model.entity.PostComment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author origami1203
 * @date 2020-12-13 16:51
 * @description PostCommentParam
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PostCommentParam extends CommentParam<PostComment> {
}
