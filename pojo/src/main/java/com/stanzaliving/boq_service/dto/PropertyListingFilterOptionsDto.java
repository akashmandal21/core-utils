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
public class PropertyListingFilterOptionsDto {
    private List<LabelValueDto<BoqType>> boqType;

    private List<LabelValueDto<BoqStatus>> boqStatus;
}
