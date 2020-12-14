package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Photo;
import lombok.Data;

import java.util.Date;

/**
 * @author ryanwang
 * @date 2019-03-21
 */
@Data
public class PhotoDTO implements EntityToDTO<PhotoDTO, Photo> {

    private Integer id;

    private String name;

    private String thumbnail;

    private Date takeTime;

    private String url;

    private String team;

    private String location;

    private String description;
}
