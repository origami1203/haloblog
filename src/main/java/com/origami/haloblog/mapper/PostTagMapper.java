package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.PostTag;
import com.origami.haloblog.model.enums.PostStatus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Mapper
public interface PostTagMapper extends BaseMapper<PostTag> {

    /**
     * Finds all post tags by post id.
     *
     * @param postId post id must not be null
     * @return a list of post tags
     */
    @NonNull
    List<PostTag> findAllByPostId(@NonNull Integer postId);

    /**
     * Finds all tag ids by post id.
     *
     * @param postId post id must not be null
     * @return a set of tag id
     */
    @Query("select postTag.tagId from PostTag postTag where postTag.postId = ?1")
    @NonNull
    Set<Integer> findAllTagIdsByPostId(@NonNull Integer postId);

    /**
     * Finds all post tags by tag id.
     *
     * @param tagId tag id must not be null
     * @return a list of post tags
     */
    @NonNull
    List<PostTag> findAllByTagId(@NonNull Integer tagId);

    /**
     * Finds all post id by tag id.
     *
     * @param tagId tag id must not be null
     * @return a set of post id
     */
    @Query("select postTag.postId from PostTag postTag where postTag.tagId = ?1")
    @NonNull
    Set<Integer> findAllPostIdsByTagId(@NonNull Integer tagId);

    /**
     * Finds all post id by tag id and post status.
     *
     * @param tagId  tag id must not be null
     * @param status post status
     * @return a set of post id
     */
    @Query("select postTag.postId from PostTag postTag,Post post where postTag.tagId = ?1 and post.id = postTag.postId and post.status = ?2")
    @NonNull
    Set<Integer> findAllPostIdsByTagIdAndPostStatus(@NonNull @Param("tagId") Integer tagId,
                                                 @NonNull @Param("status") PostStatus status);


    /**
     * Deletes post tags by post id.
     *
     * @param postId post id must not be null
     * @return a list of post tag deleted
     */
    @NonNull
    List<PostTag> deleteByPostId(@NonNull Integer postId);

    /**
     * Deletes post tags by tag id.
     *
     * @param tagId tag id must not be null
     * @return a list of post tag deleted
     */
    @NonNull
    List<PostTag> deleteByTagId(@NonNull Integer tagId);

}