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
public class DynamicFilterDTO {

    private Integer orderId;
    private String filterName;
    private String dataSource;
    private String dataReferenceId;
    private String displayType;
    private List<DynamicFiltersAnswersDTO> values;
}
