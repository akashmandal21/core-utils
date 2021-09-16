package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Vikas S T
 * @date 12-Aug-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AreaCategoryDto extends AbstractDto {

    private String parentAreaCategoryUuid;

    @NotBlank(message = "Area category name is Mandatory.")
    private String areaCategoryName;

    @NotBlank(message = "Module is Mandatory.")
    private String module;

    private List<AreaCategoryDto> subAreaCategoryList;

}
