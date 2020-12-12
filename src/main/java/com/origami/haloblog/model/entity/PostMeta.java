package com.origami.haloblog.model.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author origami1203
 * @date 2020-12-11 13:53
 * @description TODO
 */

@Entity(name = "PostMeta")
@DiscriminatorValue("0")
@EqualsAndHashCode(callSuper = true)
public class PostMeta extends Meta {

}
