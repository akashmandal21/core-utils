package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.dto.UserProfileDto;
import com.stanzaliving.housekeepingservice.enums.AreaTagStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 09-Aug-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AreaTagsDto extends AbstractDto {

    @NotBlank(message = "Area tags name is Mandatory.")
    private String areaTagName;

    @NotBlank(message = "Area category is Mandatory.")
    private String areaCategoryUuid;

    private AreaCategoryDto areaCategoryDto;

    private AreaTagStatus areaTagStatus;

    private UserProfileDto createdByUser;

    private UserProfileDto updateByUser;
}
