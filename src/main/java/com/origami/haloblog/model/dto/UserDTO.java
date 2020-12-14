package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.User;
import com.origami.haloblog.model.enums.MFAType;
import lombok.Data;

import java.util.Date;

/**
 * User output dto.
 *
 * @author origami1203
 * @date 3/16/19
 */

@Data
public class UserDTO implements EntityToDTO<UserDTO, User> {

    private Integer id;

    private String username;

    private String nickname;

    private String email;

    private String avatar;

    private String description;

    private MFAType mfaType;

    private Date createTime;

    private Date updateTime;
}
