package com.origami.haloblog.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author origami1203
 * @date 2020-12-11 21:02
 * @description TODO
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class BeanUtilsException extends AbstractHaloException {
    public BeanUtilsException(String message) {
        super(message);
    }
}
