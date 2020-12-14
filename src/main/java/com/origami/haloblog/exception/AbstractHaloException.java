package com.origami.haloblog.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author origami1203
 * @date 2020-12-11 21:04
 * @description 抽象异常类
 */

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public abstract class AbstractHaloException extends RuntimeException {

    public AbstractHaloException(String message) {
        super(message);
    }

    public AbstractHaloException(String message, Throwable cause) {
        super(message, cause);
    }

}
