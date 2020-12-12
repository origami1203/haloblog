package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.enums.LogType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author origami1203
 * @date 2020-12-10 15:46
 * @description 日志
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Log extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Log key.
     */
    @Column(name = "log_key", length = 1023)
    private String logKey;

    /**
     * 日志类型
     */
    @Column(name = "type", nullable = false)
    private LogType type;

    /**
     * 日志内容
     */
    @Column(name = "content", length = 1023, nullable = false)
    private String content;

    /**
     * ip
     */
    @Column(name = "ip_address", length = 127)
    private String ipAddress;

}
