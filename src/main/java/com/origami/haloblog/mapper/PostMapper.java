package com.origami.haloblog.mapper;

import com.origami.haloblog.mapper.base.BasePostMapper;
import com.origami.haloblog.model.entity.Post;
import com.origami.haloblog.model.enums.PostStatus;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

/**
 * @author origami1203
 * @date 2020-12-16 9:39
 * @description PostMapper
 */
public interface PostMapper extends BasePostMapper<Post> {
    /**
     * Find by post year and month and slug.
     *
     * @param year  post create year
     * @param month post create month
     * @param slug  post slug
     * @return a optional of post
     */
    Optional<Post> findBy(@Param("year") Integer year, @Param("month") Integer month, @Param("slug") String slug);

    /**
     * Find by post year and slug.
     *
     * @param year  post create year
     * @param slug  post slug
     * @return a optional of post
     */
    Optional<Post> findBy(@Param("year") Integer year, @Param("slug") String slug);


    /**
     * Find by post year and month and slug and status.
     *
     * @param year   post create year
     * @param month  post create month
     * @param slug   post slug
     * @param status post status
     * @return a optional of post
     */
    Optional<Post> findBy(@Param("year") Integer year, @Param("month") Integer month, @Param("slug") String slug, @Param("status") PostStatus status);

    /**
     * Find by post year and month and day and slug.
     *
     * @param year  post create year
     * @param month post create month
     * @param day   post create day
     * @param slug  post slug
     * @return a optional of post
     */
    Optional<Post> findBy(@Param("year") Integer year, @Param("month") Integer month, @Param("day") Integer day, @Param("slug") String slug);

    /**
     * Find by post year and month and day and slug and status.
     *
     * @param year   post create year
     * @param month  post create month
     * @param day    post create day
     * @param slug   post slug
     * @param status post status
     * @return a optional of post
     */
    Optional<Post> findBy(@Param("year") Integer year, @Param("month") Integer month, @Param("day") Integer day, @Param("slug") String slug, @Param("status") PostStatus status);
}
