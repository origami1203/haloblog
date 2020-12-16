package com.origami.haloblog.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.enums.PostStatus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * @author origami1203
 * @date   2020-12-16 08:37
 */
@Mapper
public interface BasePostMapper<POST> extends BaseMapper<POST> {



    /**
     * Finds posts by status.
     *
     * @param status post staus must not be null
     * @return a list of post
     */

    @NonNull
    List<POST> findAllByStatus(@NonNull PostStatus status);

    /**
     * Finds posts by status.
     *
     * @param status post staus must not be null
     * @param sort   sort info must not be null
     * @return a list of post
     */
    @NonNull
    List<POST> findAllByStatusAndSort(@NonNull @Param("status") PostStatus status,
                                      @NonNull @Param("sort") String sort);

    /**
     * Gets post by slug and status.
     *
     * @param slug   slug must not be blank
     * @param status status must not be null
     * @return an optional post
     */
    @NonNull
    Optional<POST> getBySlugAndStatus(@NonNull @Param("slug") String slug,
                                      @NonNull @Param("status") PostStatus status);

    /**
     * Gets post by id and status.
     *
     * @param id     id must not be blank
     * @param status status must not be null
     * @return an optional post
     */
    @NonNull
    Optional<POST> getByIdAndStatus(@NonNull @Param("id") Integer id,
                                    @NonNull @Param("status") PostStatus status);

    /**
     * Get post by slug
     *
     * @param slug post slug
     * @return Optional<Post>
     */
    Optional<POST> getBySlug(@NonNull String slug);

    /**
     * Updates post visits.
     *
     * @param visits visit delta
     * @param postId post id must not be null
     * @return updated rows
     */
    int updateVisitors(@Param("visits") long visits, @Param("postId") @NonNull Integer postId);

    /**
     * Updates post likes.
     *
     * @param likes  likes delta
     * @param postId post id must not be null
     * @return updated rows
     */
    int updateLikes(@Param("likes") long likes, @Param("postId") @NonNull Integer postId);

    /**
     * Updates post original content.
     *
     * @param content content could be blank but disallow to be null
     * @param postId  post id must not be null
     * @return updated rows
     */
    int updateOriginalContent(@Param("content") @NonNull String content, @Param("postId") @NonNull Integer postId);

    /**
     * Updates post status by post id.
     *
     * @param status post status must not be null.
     * @param postId post id must not be null.
     * @return updated rows.
     */
    int updateStatus(@Param("status") @NonNull PostStatus status, @Param("postId") @NonNull Integer postId);

    /**
     * Updates post format content by post id.
     *
     * @param formatContent format content must not be null.
     * @param postId        post id must not be null.
     * @return updated rows.
     */
    int updateFormatContent(@Param("formatContent") @NonNull String formatContent, @Param("postId") @NonNull Integer postId);
}