package com.stanzaliving.housekeepingservice.dto;


import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.housekeepingservice.enums.AreaCommonSortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class AreaCommonFilterDto {

    private String areaName;

    private PaginationRequest pageRequest;

    private AreaCommonSortSpecs sortSpecs;

    private SortDirection sortDirection;

    private String areaTagUuid;

    private String areaTagName;

    private String residenceUuid;

    private String categoryUuid;

    private List<String> areaTagUuids;


}
