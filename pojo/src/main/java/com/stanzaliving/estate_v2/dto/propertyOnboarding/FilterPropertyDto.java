package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FilterPropertyDto {
    private List<String> propertyTypeUuid;
    private List<String> cityName;
    private List<String> microMarketName;
    private List<String> user;
    private List<String> propertyStatus;
    private Date startDate;
    private Date endDate;
}
