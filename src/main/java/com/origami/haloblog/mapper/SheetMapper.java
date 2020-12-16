package com.origami.haloblog.mapper;

import com.origami.haloblog.mapper.base.BasePostMapper;
import com.origami.haloblog.model.entity.Sheet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * @author origami1203
 * @date 2020-12-16 13:20
 * @description SheetMapper
 */
public interface SheetMapper extends BasePostMapper<Sheet> {
}
