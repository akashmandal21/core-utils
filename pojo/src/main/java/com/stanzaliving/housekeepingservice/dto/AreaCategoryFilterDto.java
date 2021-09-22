package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 12-Aug-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class AreaCategoryFilterDto {
    private String module;
    private String areaCategoryName;
}
