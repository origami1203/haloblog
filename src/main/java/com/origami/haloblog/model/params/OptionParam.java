package com.origami.haloblog.model.params;

import com.origami.haloblog.model.dto.base.DTOToEntity;
import com.origami.haloblog.model.entity.Option;
import com.origami.haloblog.model.enums.OptionType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author origami1203
 * @date 2020-12-12 19:52
 * @description OptionParam
 */

@Data
public class OptionParam implements DTOToEntity<Option> {
    @NotBlank(message = "Option key must not be blank")
    @Size(max = 100, message = "Length of option key must not be more than {max}")
    private String key;


    @Size(max = 1023, message = "Length of option value must not be more than {max}")
    private String value;

    private OptionType type;
}
