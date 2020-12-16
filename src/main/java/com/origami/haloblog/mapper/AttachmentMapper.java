package com.origami.haloblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origami.haloblog.model.entity.Attachment;
import com.origami.haloblog.model.enums.AttachmentType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author 28455
 */
@Mapper
public interface AttachmentMapper extends BaseMapper<Attachment> {

    /**
     * 查找所有的MediaType
     * @return MediaType的集合
     */
    List<String> findAllMediaType();

    /**
     * 查找所有的AttachmentType
     * @return AttachmentType的几个
     */
    List<AttachmentType> findAllType();

    /**
     * 计算path的数量
     * @param path 路径
     * @return 数量
     */
    long countByPath(@NonNull String path);
}