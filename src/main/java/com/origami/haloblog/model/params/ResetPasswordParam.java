package com.origami.haloblog.model.params;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author origami1203
 * @date 2020-12-13 16:45
 * @description ResetPasswordParam
 */

@Data
public class ResetPasswordParam {
    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "邮箱不能为空")
    private String email;

    private String code;

    private String password;
}
