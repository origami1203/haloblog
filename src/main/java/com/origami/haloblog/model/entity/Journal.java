package com.origami.haloblog.model.entity;

import com.origami.haloblog.model.enums.JournalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


/**
 * @author origami1203
 * @date 2020-12-10 15:09
 * @description 日记账
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "journal")
public class Journal extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "source_content", nullable = false)
    @Lob
    private String sourceContent;

    @Column(name = "content", nullable = false)
    @Lob
    private String content;

    @Column(name = "likes")
    @ColumnDefault("0")
    private Long likes;

    @Column(name = "type")
    @ColumnDefault("1")
    private JournalType type;

}
