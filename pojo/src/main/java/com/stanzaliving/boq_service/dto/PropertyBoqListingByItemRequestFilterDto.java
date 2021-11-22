package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Note any added/removed key in this DTO should also be added/removed to/from
 * com.stanzaliving.boq_service.dto.PropertyBoqListingRequestFilterDto
 */

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBoqListingByItemRequestFilterDto {
    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 10000;

    @Builder.Default
    private String sortBy = "ItemCode";

    @Builder.Default
    private String sortOrder = "asc";

    private List<LabelValueDto<BoqType>> boqType;

    private List<LabelValueDto<BoqStatus>> boqStatus;
}
