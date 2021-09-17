package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.housekeepingservice.enums.AreaTagStatus;
import com.stanzaliving.housekeepingservice.enums.AreaTagsSortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
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
    private String areaTagName;
    private AreaTagStatus areaTagStatus;
    private String areaCategory;
    private PaginationRequest pageRequest;

    //Sort
    private AreaTagsSortSpecs sortSpecs;
    private SortDirection sortDirection;
}
