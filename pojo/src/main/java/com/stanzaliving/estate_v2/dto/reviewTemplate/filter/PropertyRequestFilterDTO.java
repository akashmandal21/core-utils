package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class PropertyRequestFilterDTO {
    private List<PropertyTypeDTO> propertyTypeDTOS;

    private List<PropertyTypeAndStatus> propertyTypeAndStatuses;

    private PropertyLocationFilterDTO propertyLocationFilter;
    private List<DynamicFilterSectionsDTO> dynamicFilterSections;
    private Map<String,List<PropertyStatusDTO>> propertyTypeAndStatusMap;
    private Map<String,DynamicFilterDTO> dynamicFilterSectionsMap;
}
