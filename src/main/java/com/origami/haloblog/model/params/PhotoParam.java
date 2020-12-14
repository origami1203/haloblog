package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Photo;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-12 19:53
 * @description PhotoParam
 */

@Data
public class PhotoParam implements DTOToEntity<Photo> {
    @NotBlank(message = "照片名称不能为空")
    private String name;

    private String description;

    private Date takeTime;

    private String location;

    @NotBlank(message = "照片缩略图链接地址不能为空")
    private String thumbnail;

    @NotBlank(message = "照片链接地址不能为空")
    private String url;

    private String team;
}
