package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Journal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JournalMapper extends BaseMapper<Journal> {

}