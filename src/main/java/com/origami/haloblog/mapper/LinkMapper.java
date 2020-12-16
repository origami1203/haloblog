package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Link;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 28455
 */
@Mapper
public interface LinkMapper extends BaseMapper<Link> {

    /**
     * Find all link teams.
     *
     * @return a list of teams
     */
    List<String> findAllTeams();

}