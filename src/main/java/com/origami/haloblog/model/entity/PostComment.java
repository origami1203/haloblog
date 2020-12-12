package com.origami.haloblog.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author origami1203
 * @date 2020-12-10 15:34
 * @description 文章评论
 */

@Entity
@DiscriminatorValue("0")
public class PostComment extends Comment{
}
