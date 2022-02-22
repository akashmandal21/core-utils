package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DynamicFiltersAnswersDTO {

    String id;
    String value;
    Integer count;
}
