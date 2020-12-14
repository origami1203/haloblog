package com.origami.haloblog.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author origami1203
 * @date 2020-12-11 21:02
 * @description TODO
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BeanUtilsException extends AbstractHaloException {
    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }

}
