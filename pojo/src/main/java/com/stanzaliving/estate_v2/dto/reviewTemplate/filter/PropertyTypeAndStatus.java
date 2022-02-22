package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;


import com.stanzaliving.estate_v2.dto.reviewTemplate.filter.PropertyStatusDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PropertyTypeAndStatus {
    private String name;
    private String id;
    private List<PropertyStatusDTO> propertyStatuses;

}
