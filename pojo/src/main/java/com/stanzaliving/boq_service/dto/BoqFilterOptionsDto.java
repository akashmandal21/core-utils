package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.enums.PropertyEntityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoqFilterOptionsDto {
    private List<LabelValueDto<Long>> cities;
    private List<LabelValueDto<String>> microMarkets;
    private List<LabelValueDto<PropertyEntityType>> propertyTypes;
}
