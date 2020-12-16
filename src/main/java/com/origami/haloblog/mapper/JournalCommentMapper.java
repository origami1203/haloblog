package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.mapper.base.BaseCommentMapper;
import com.origami.haloblog.model.entity.JournalComment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.List;

/**
 * @author origami1203
 * @date 2020-12-15 13:55
 * @description JournalCommentMapper
 */

public interface JournalCommentMapper extends BaseCommentMapper<JournalComment> {
}
