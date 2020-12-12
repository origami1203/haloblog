package com.origami.haloblog.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author origami1203
 * @date 2020-12-10 15:35
 * @description TODO
 */

@Entity
@DiscriminatorValue("1")
public class SheetComment extends Comment{
}
