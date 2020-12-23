package com.origami.haloblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.origami.haloblog.model.entity.User;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * @author origami1203
 * @date 2020-12-23 16:41
 * @description UserService
 */
public interface UserService extends IService<User> {

    /**
     * 通过username查找
     * @param username username
     * @return user对象
     */
    Optional<User> getByUsername(@NonNull String username);

    /**
     * Gets user by email.
     *
     * @param email email must not be blank
     * @return an optional user
     */
    Optional<User> getByEmail(@NonNull String email);

    /**
     * Updates user password.
     *
     * @param oldPassword old password must not be blank
     * @param newPassword new password must not be blank
     * @param userId      user id must not be null
     * @return updated user detail
     */
    @NonNull
    User updatePassword(@NonNull String oldPassword, @NonNull String newPassword, @NonNull Integer userId);


}
