package com.stanzaliving.sfr.dto.reviewTemplate.filter;

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

    private PropertyLocationFilterDTO propertyLocationFilter;
    private List<DynamicFilterSectionsDTO> dynamicFilterSections;
}
