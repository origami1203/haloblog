package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * @author origami
 * @date 2020-12-15 11:50
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 计算该名字对应的数量
     * @param name 要查找的名字
     * @return 数量
     */
    long countByName(@NonNull String name);

    /**
     * Counts by category id.
     *
     * @param id category id must not be null
     * @return the count
     */
    long countById(@NonNull Integer id);

    /**
     * Get category by slug
     *
     * @param slug slug
     * @return Optional of Category
     */
    Optional<Category> getBySlug(@NonNull String slug);

    /**
     * Get category by name.
     *
     * @param name name
     * @return Optional of Category
     */
    Optional<Category> getByName(@NonNull String name);

    /**
     * List categories by parent id.
     *
     * @param id parent id.
     * @return list of category
     */
    List<Category> findByParentId(@NonNull Integer id);

}