package com.origami.haloblog.model.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author origami1203
 * @date 2020-12-11 13:56
 * @description TODO
 */

@Entity(name = "SheetMeta")
@DiscriminatorValue("1")
@EqualsAndHashCode(callSuper = true)
public class SheetMeta extends Meta {

}
