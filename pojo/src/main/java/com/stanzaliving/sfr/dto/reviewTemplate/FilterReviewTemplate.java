package com.stanzaliving.sfr.dto.reviewTemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilterReviewTemplate {

    private List<String> cities;
    private List<String> micromarkets;
    List<String> propertyType;
    List<String> status;
}
