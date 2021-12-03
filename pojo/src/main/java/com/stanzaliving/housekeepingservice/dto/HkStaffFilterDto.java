package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.housekeepingservice.enums.HkStaffSortSpecs;
import com.stanzaliving.item_master.enums.SortDirection;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class HkStaffFilterDto {
    private String employeeName;
    private String uuid;
    private String mobileNo;
    private PaginationRequest pageRequest;

    //Sort
    private HkStaffSortSpecs sortSpecs;
    private SortDirection sortDirection;
}
