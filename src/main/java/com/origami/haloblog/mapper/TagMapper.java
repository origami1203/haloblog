package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * @author origami1203
 * @date 2020-12-15 17:09
 */
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

    /**
     * Get tag by slug
     *
     * @param slug slug must not be null.
     * @return an optional of slug.
     */
    Optional<Tag> getBySlug(@NonNull String slug);

    /**
     * Get tag by name
     *
     * @param name name must not be null.
     * @return an optional of tag
     */
    Optional<Tag> getByName(@NonNull String name);
}