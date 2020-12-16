package com.origami.haloblog.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author origami1203
 * @date   2020-12-16 08:49
 */
@Mapper
public interface BaseMetaMapper<META> extends BaseMapper<META> {
    /**
     * Finds all metas by post id.
     *
     * @param postId post id must not be null
     * @return a list of meta
     */
    @NonNull
    List<META> findAllByPostId(@NonNull Integer postId);

    /**
     * Deletes post metas by post id.
     *
     * @param postId post id must not be null
     * @return a list of post meta deleted
     */
    @NonNull
     int deleteByPostId(@NonNull Integer postId);

}