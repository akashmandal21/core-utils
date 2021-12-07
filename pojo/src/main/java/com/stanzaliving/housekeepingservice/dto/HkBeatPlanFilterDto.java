package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.housekeepingservice.enums.HkBeatPlanSortSpecs;
import com.stanzaliving.housekeepingservice.enums.HkBeatPlanStatus;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 13-Nov-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class HkBeatPlanFilterDto {
    private String microMarketUuid;
    private String cityUuid;
    private HkBeatPlanStatus hkBeatPlanStatus;
    private PaginationRequest pageRequest;
    private String microClusterUuid;
    private List<String> residenceUuids;
    private boolean isApproval;
    //Sort
    private HkBeatPlanSortSpecs sortSpecs;
    private SortDirection sortDirection;
}
