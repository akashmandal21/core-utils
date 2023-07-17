package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BulkActionsModalFilterOptionsDto {
    private List<LabelValueDto<Long>> cities;

    private List<LabelValueDto<String>> microMarkets;

    private List<LabelValueDto<PropertyEntityType>> propertyTypes;

    private List<LabelValueDto<BoqItemProvider>> doneBy;

    private List<LabelValueDto<AreaOfUse>> usedByArea;
}
