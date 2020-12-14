package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.mapper.base.BaseCommonMapper;
import com.origami.haloblog.model.entity.Category;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * @author origami1203
 * @date 2020-12-13 18:58
 * @description CategoryMapper
 */
public interface CategoryMapper extends BaseCommonMapper<Category> {

    int getCountByName(@NonNull String name);

    int getCountById(@NonNull Integer id);

    Optional<Category> getBySlug(@NonNull String slug);

    Optional<Category> getByName(@NonNull String name);

    List<Category> findByParentId(@NonNull Integer id);
}
