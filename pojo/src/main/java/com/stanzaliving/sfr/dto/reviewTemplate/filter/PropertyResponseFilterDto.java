package com.stanzaliving.sfr.dto.reviewTemplate.filter;

import com.stanzaliving.core.leadership.dto.DateRange;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PropertyResponseFilterDto {

    private List<String> propertyTypeNameWithStatus;
    private List<String> city;
    private List<String> microMarket;
    private DateRange createdBetween;
    private DateRange propertyNamingBetween;
}
