package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DynamicFilterSectionsDTO {
    private String sectionName;
    private List<DynamicFilterDTO> filters;
}
