package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 09-Aug-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class AreaTagsFilterDto {

    private String areaTagsName;

    private String areaCategory;

    private PaginationRequest pageRequest;
}
