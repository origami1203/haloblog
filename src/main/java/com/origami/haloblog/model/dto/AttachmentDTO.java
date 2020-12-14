package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Attachment;
import com.origami.haloblog.model.enums.AttachmentType;
import lombok.Data;

import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-13 17:17
 * @description TODO
 */

@Data
public class AttachmentDTO implements EntityToDTO<AttachmentDTO, Attachment> {

    private Integer id;

    private String name;

    private String path;

    private String fileKey;

    private String thumbPath;

    private String mediaType;

    private String suffix;

    private Integer width;

    private Integer height;

    private Long size;

    private AttachmentType type;

    private Date createTime;
}
