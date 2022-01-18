package com.stanzaliving.boq_service.dto.groundrequest;

import com.stanzaliving.boq_service.dto.LabelValueDto;
import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemMetaInfoDto {

    private List<LabelValueDto<AreaOfUse>> areaOfUses;

    private BigDecimal maxNegative;

    private ItemGroundRequestDto itemGroundRequest;
}
