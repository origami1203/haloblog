package com.origami.haloblog.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.enums.CommentStatus;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author origami1203
 * @date 2020-12-16 11:08
 * @description BaseCommentMapper
 */
public interface BaseCommentMapper<COMMENT> extends BaseMapper<COMMENT> {

//  TODO @SensitiveConceal 脱敏
    /**
     * Finds all comments by post id.
     *
     * @param postId post id must not be null
     * @return a list of comment
     */
    @NonNull
    List<COMMENT> findAllByPostId(@NonNull @Param("postId") Integer postId);


    /**
     * Count comments by post id.
     *
     * @param postId post id must not be null.
     * @return comments count
     */
    long countByPostId(@NonNull @Param("postId") Integer postId);

    /**
     * Counts by comment status.
     *
     * @param status comment status must not be null
     * @return comment count
     */
    long countByStatus(@NonNull @Param("status") CommentStatus status);

    /**
     * Removes comments by post id.
     *
     * @param postId post id must not be null
     * @return a list of comment deleted
     */
    @NonNull
    int deleteByPostId(@NonNull @Param("postId") Integer postId);

    /**
     * Removes comments by parent id.
     *
     * @param id comment id must not be null
     * @return a list of comment deleted
     */
    @NonNull
    int deleteByParentId(@NonNull @Param("id") Long id);

//   TODO @SensitiveConceal
    /**
     * Finds comments by post id, comment status.
     *
     * @param postId post id must not be null
     * @param status comment status must not be null
     * @return a list of comment
     */
    @NonNull
    List<COMMENT> findAllByPostIdAndStatus(@Param("postId") Integer postId,
                                           @Param("status") CommentStatus status);

//   TODO @SensitiveConceal
    /**
     * Finds comments by post id, comment status and parent id.
     *
     * @param postId   post id must not be null
     * @param status   comment status must not be null
     * @param parentId comment parent id must not be null
     * @return a list of comment
     */
    @NonNull
    List<COMMENT> findAllByPostIdAndStatusAndParentId(@NonNull @Param("postId") Integer postId,
                                                      @NonNull @Param("status") CommentStatus status,
                                                      @NonNull @Param("parentId") Long parentId);

    //   TODO @SensitiveConceal
    /**
     * Finds comments by post id and parent id.
     *
     * @param postId   post id must not be null
     * @param parentId comment parent id must not be null
     * @return a list of comment
     */
    @NonNull
    List<COMMENT> findAllByPostIdAndParentId(@NonNull Integer postId, @NonNull Long parentId);



}
