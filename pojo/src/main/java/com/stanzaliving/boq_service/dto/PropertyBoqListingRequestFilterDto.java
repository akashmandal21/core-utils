package com.stanzaliving.boq_service.dto;

import com.stanzaliving.boq_service.enums.BoqLabel;
import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Note any added/removed key in this DTO should also be added/removed to/from
 * com.stanzaliving.boq_service.dto.PropertyBoqListingByItemRequestFilterDto
 */

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBoqListingRequestFilterDto {

    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 10000;

    @Builder.Default
    private String sortBy = "UpdatedOn";

    @Builder.Default
    private String sortOrder = "desc";

    private List<LabelValueDto<BoqType>> boqType;

    private List<LabelValueDto<BoqLabel>> boqLabel;

    private List<LabelValueDto<BoqStatus>> boqStatus;

    private String itemFilter;

    private List<String> itemUuids;
}
