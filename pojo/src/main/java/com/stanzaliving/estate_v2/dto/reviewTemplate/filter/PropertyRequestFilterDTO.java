package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;

import com.stanzaliving.core.leadership.dto.DateRangeFilter;
import com.stanzaliving.core.leadership.dto.PropertyLocationFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PropertyRequestFilterDTO {
    private List<PropertyTypeDTO> propertyTypeDTOS;

    private List<PropertyTypeAndStatus> propertyTypeAndStatuses;

    private PropertyLocationFilter propertyLocationFilter;
    private List<DynamicFilterSectionsDTO> dynamicFilterSections;
}
