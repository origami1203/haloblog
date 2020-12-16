package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author origami1203
 * @date 2020-12-16 13:50
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * Finds by menu parent id.
     *
     * @param id parent id must not be null.
     * @return a list of menu.
     */
    List<Menu> findByParentId(@NonNull Integer id);

    /**
     * Finds by menu team.
     *
     * @param team team must not be null.
     * @param sort sort.
     * @return a list of menu
     */
    List<Menu> findByTeam(@Param("team") String team,@Param("sort") String sort);

    /**
     * Find all menu teams.
     *
     * @return a list of teams
     */
    List<String> findAllTeams();
}