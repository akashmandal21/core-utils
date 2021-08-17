package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqType;
import com.stanzaliving.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBoqListingRequestFilterDto {

    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 20;

    @Builder.Default
    private String sortBy = "UpdatedOn";

    @Builder.Default
    private String sortOrder = "desc";

    private List<BoqType> boqTypes;

    private List<BoqStatus> boqStatuses;
}
