package com.stanzaliving.estate_v2.dto.propertyOnboarding;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class FilterPropertyDto {
    private List<String> propertyTypeName;
    private List<String> cityName;
    private List<String> microMarketName;
    private List<String> propertyStatus;
    private Date startDate;
    private Date endDate;
    //    TODO: add for user
}
