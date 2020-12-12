package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.enums.MFAType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-11 13:57
 * @description TODO
 */

@Data
@Entity
@Table(name = "user")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "username", length = 50, nullable = false)
    private String username;

    /**
     * 昵称,将展示在页面上
     */
    @Column(name = "nickname", nullable = false)
    private String nickname;

    /**
     * 密码
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 邮箱
     */
    @Column(name = "email", length = 127)
    private String email;

    /**
     * 头像
     */
    @Column(name = "avatar", length = 1023)
    private String avatar;

    /**
     * 描述
     */
    @Column(name = "description", length = 1023)
    private String description;

    /**
     * 过期时间
     */
    @Column(name = "expire_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireTime;

    /**
     * mfa type
     */
    @Column(name = "mfa_type", nullable = false)
    @ColumnDefault("0")
    private MFAType mfaType;

    /**
     * two factor auth key
     */
    @Column(name = "mfa_key", length = 64)
    private String mfaKey;
}
