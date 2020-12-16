package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * @author origami1203
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * Gets user by username.
     *
     * @param username username must not be blank
     * @return an optional user
     */
    @NonNull
    Optional<User> findByUsername(@NonNull String username);

    /**
     * Gets user by email.
     *
     * @param email email must not be blank
     * @return an optional user
     */
    @NonNull
    Optional<User> findByEmail(@NonNull String email);
}