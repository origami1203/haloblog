package com.origami.haloblog.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.List;

/**
 * @author origami1203
 * @date 2020-12-13 19:01
 * @description TODO
 */

@Mapper
public interface BaseCommonMapper<T> extends BaseMapper<T> {

    /**
     * 查找指定的ids对应的T,并排序
     * @param ids id的集合
     * @param sortParam 排序字段
     * @return T的list集合
     */
    List<T> findAllByIds(@NonNull Collection<?> ids,@NonNull String sortParam);

    IPage<T> findAllByIdIn(@NonNull Collection<?> ids, @NonNull Pageable pageable);

    long deleteByIdIn(@NonNull Collection<?> ids);
}
