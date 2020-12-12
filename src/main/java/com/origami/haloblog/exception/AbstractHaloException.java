package com.origami.haloblog.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author origami1203
 * @date 2020-12-11 21:04
 * @description TODO
 */

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractHaloException extends RuntimeException {
    private String message;
}
