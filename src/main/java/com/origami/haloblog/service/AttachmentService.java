package com.origami.haloblog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.origami.haloblog.model.dto.AttachmentDTO;
import com.origami.haloblog.model.entity.Attachment;
import com.origami.haloblog.model.enums.AttachmentType;
import com.origami.haloblog.model.query.AttachmentQuery;
import org.springframework.lang.NonNull;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.List;

/**
 * @author origami1203
 * @date 2020-12-16 19:49
 * @description AttachmentService
 */
public interface AttachmentService extends IService<Attachment> {
    /**
     * Pages attachment output dtos.
     *
     * @param page        page info must not be null
     * @param attachmentQuery attachment query param.
     * @return a page of attachment output dto
     */
    @NonNull
    IPage<AttachmentDTO> pageDtosBy(@NonNull IPage<AttachmentDTO> page,
                                    AttachmentQuery attachmentQuery);

    /**
     * Uploads file.
     *
     * @param file multipart file must not be null
     * @return attachment info
     */
    @NonNull
    Attachment upload(@NonNull MultipartFile file);

    /**
     * Removes attachment permanently.
     *
     * @param id attachment id must not be null
     * @return attachment detail deleted
     */
    @NonNull
    Attachment removePermanently(@NonNull Integer id);

    /**
     * Removes attachment permanently in batch.
     *
     * @param ids attachment ids must not be null
     * @return attachment detail list deleted
     */
    @NonNull
    List<Attachment> removePermanently(@NonNull Collection<Integer> ids);

    /**
     * Converts to attachment output dto.
     *
     * @param attachment attachment must not be null
     * @return an attachment output dto
     */
    @NonNull
    AttachmentDTO convertToDto(@NonNull Attachment attachment);

    /**
     * List all media type.
     *
     * @return list of media type
     */
    List<String> listAllMediaType();

    /**
     * List all type.
     *
     * @return list of type.
     */
    List<AttachmentType> listAllType();

    /**
     * Replace attachment url in batch.
     *
     * @param oldUrl old blog url.
     * @param newUrl new blog url.
     * @return replaced attachments.
     */
    List<Attachment> replaceUrl(@NonNull String oldUrl, @NonNull String newUrl);
}
