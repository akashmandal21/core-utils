package com.stanzaliving.leadService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AutoExpireLeadConfigMapDto {

    Map<String, String> cityWiseLeadExpiryDaysMap;
    Map<String, String> mmWiseLeadExpiryDaysMap;
    Map<String, String> residenceWiseLeadExpiryDaysMap;
    private int defaultDays;
}
