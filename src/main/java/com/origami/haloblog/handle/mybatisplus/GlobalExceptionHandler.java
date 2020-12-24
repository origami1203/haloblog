package com.origami.haloblog.handle.mybatisplus;

import com.origami.haloblog.model.support.ResponseBean;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * @author origami1203
 * @date 2020-12-24 9:12
 * @description 全局异常处理
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 数据校验异常的全局处理
     * @param e 异常
     * @return ResponseBean
     */
    @ExceptionHandler({BindException.class,
            ConstraintViolationException.class,
            ServletRequestBindingException.class})
    public ResponseBean<?> handleValidationException(Exception e) {
        String exceptionClassName = e.getClass().getName();
        String message;

        switch (exceptionClassName) {
            case "BindException":
                BindException be = (BindException) e;
                message = getBindResultMessage(be.getBindingResult());
                break;
            case "ConstraintViolationException":
                ConstraintViolationException cve = (ConstraintViolationException) e;
                message =  cve.getConstraintViolations()
                   .stream()
                   .map(ConstraintViolation::getMessage)
                   .collect(Collectors.joining(";"));
                break;
            case "MethodArgumentNotValidException":
                MethodArgumentNotValidException manve =
                        (MethodArgumentNotValidException) e;
                message = getBindResultMessage(manve.getBindingResult());
                break;
            case "MissingServletRequestParameterException":
                MissingServletRequestParameterException msrbe =
                        (MissingServletRequestParameterException) e;
                message = msrbe.getParameterName() + "不能为空";
                break;
            case "MissingPathVariableException":
                MissingPathVariableException mpve =
                        (MissingPathVariableException) e;
                message = mpve.getVariableName() + "不能为空";
                break;
            default:
                message = "校验出错:" + e.getLocalizedMessage();
        }

        return ResponseBean.fail(HttpStatus.BAD_REQUEST.value(),message,null);
    }

    /**
     * 获取BindingResult的异常信息
     * @param result BindingResult
     * @return 异常信息的字符串表示形式
     */
    private String getBindResultMessage(BindingResult result) {

        return result.getAllErrors()
                     .stream()
                     .map(DefaultMessageSourceResolvable::getDefaultMessage)
                     .collect(Collectors.joining(";"));
    }
}
