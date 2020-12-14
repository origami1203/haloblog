package com.origami.haloblog.model.dto.base;

import com.origami.haloblog.utils.BeanUtils;
import org.springframework.lang.NonNull;

/**
 * @author origami1203
 * @date 2020-12-11 15:52
 * @description TODO
 */

public interface EntityToDTO<DTO extends EntityToDTO<DTO, DOMAIN>, DOMAIN> {
    /**
     * Convert from domain.(shallow)
     *
     * @param domain domain data
     * @return converted dto data
     */
    @SuppressWarnings("unchecked")
    @NonNull
    default <T extends DTO> T convertFrom(@NonNull DOMAIN domain) {

        BeanUtils.updateProperties(domain, this);

        return (T) this;
    }

}
