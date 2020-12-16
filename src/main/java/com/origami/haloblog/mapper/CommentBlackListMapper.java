package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.CommentBlackList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author origami1203
 * @date 2020-12-15 12:38
 */
@Mapper
public interface CommentBlackListMapper extends BaseMapper<CommentBlackList> {
    /**
     * 根据IP地址获取数据
     * @param ipAddress ip地址
     * @return CommentBlackList
     */
    Optional<CommentBlackList> findByIpAddress(String ipAddress);

    /**
     * Update Comment BlackList By IPAddress
     *
     * @param commentBlackList  黑名单
     * @return result
     */
    int updateByIpAddress(@Param("commentBlackList") CommentBlackList commentBlackList);
}