package com.origami.haloblog.model.params;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 19:53
 * @description PasswordParam
 */
@Data
public class PasswordParam {
    @NotBlank(message = "旧密码不能为空")
    @Size(max = 100, message = "密码的字符长度不能超过 {max}")
    private String oldPassword;

    @NotBlank(message = "新密码不能为空")
    @Size(max = 100, message = "密码的字符长度不能超过 {max}")
    private String newPassword;
}
