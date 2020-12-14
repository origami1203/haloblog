package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.User;
import com.origami.haloblog.model.support.Save;
import com.origami.haloblog.model.support.Update;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 19:57
 * @description UserParam
 */
@Data
public class UserParam implements DTOToEntity<User> {
    @NotBlank(message = "用户名不能为空", groups = {Save.class, Update.class})
    @Size(max = 50, message = "用户名的字符长度不能超过 {max}", groups = {Save.class, Update.class})
    private String username;

    @NotBlank(message = "用户昵称不能为空", groups = {Save.class, Update.class})
    @Size(max = 255, message = "用户昵称的字符长度不能超过 {max}", groups = {Save.class, Update.class})
    private String nickname;

    @Email(message = "电子邮件地址的格式不正确", groups = {Save.class, Update.class})
    @NotBlank(message = "电子邮件地址不能为空", groups = {Save.class, Update.class})
    @Size(max = 127, message = "电子邮件的字符长度不能超过 {max}", groups = {Save.class, Update.class})
    private String email;

    @Null(groups = Update.class)
    @Size(min = 8, max = 100, message = "密码的字符长度必须在 {min} - {max} 之间", groups = {Save.class})
    private String password;

    @Size(max = 1023, message = "头像链接地址的字符长度不能超过 {max}", groups = {Save.class, Update.class})
    private String avatar;

    @Size(max = 1023, message = "用户描述的字符长度不能超过 {max}", groups = {Save.class, Update.class})
    private String description;
}
