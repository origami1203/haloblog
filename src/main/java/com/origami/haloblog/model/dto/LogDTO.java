package com.origami.haloblog.model.dto;

import com.origami.haloblog.model.dto.base.EntityToDTO;
import com.origami.haloblog.model.entity.Log;
import com.origami.haloblog.model.enums.LogType;
import lombok.Data;

import java.util.Date;

/**
 * @author origami1203
 * @date 2020-12-13 18:48
 * @description TODO
 */

@Data
public class LogDTO implements EntityToDTO<LogDTO, Log> {
    private Long id;

    private String logKey;

    private LogType type;

    private String content;

    private String ipAddress;

    private Date createTime;

}
