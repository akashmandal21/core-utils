package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Vikas S T
 * @date 12-Aug-21
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaCategoryDto {

    private String uuid;

    private String parentAreaCategoryUuid;

    @NotBlank(message = "Area category name is Mandatory.")
    private String areaCategoryName;

    @NotBlank(message = "Module is Mandatory.")
    private String module;

    private List<AreaCategoryDto> subAreaCategoryList;

}
