package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Photo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Mapper
public interface PhotoMapper extends BaseMapper<Photo> {
    /**
     * Query photos by team
     *
     * @param team team
     * @param sort sort
     * @return list of photo
     */
    List<Photo> findByTeam(@Param("team") String team, @Param("sort") String sort);

    /**
     * Find all photo teams.
     *
     * @return list of teams.
     */
    @Query(value = "select distinct p.team from Photo p")
    List<String> findAllTeams();
}