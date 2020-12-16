package com.origami.haloblog.model.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author origami1203
 * @date 2020-12-16 18:59
 * @description BaseResponse
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 开发版本 响应信息
     */
    private String devMessage;

    /**
     * 响应体
     */
    private T data;

    public BaseResponse(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回的响应
     * @param status 默认 200
     * @param message 成功信息
     * @param data  数据
     * @param <T> 数据的类型
     * @return 成功响应
     */
    public static <T> BaseResponse<T> ok(Integer status, String message, T data) {
        return new BaseResponse<>(HttpStatus.OK.value(),
                                  HttpStatus.OK.getReasonPhrase(), data);
    }

}
