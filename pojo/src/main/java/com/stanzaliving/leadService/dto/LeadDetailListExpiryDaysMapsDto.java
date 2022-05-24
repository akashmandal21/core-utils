package com.stanzaliving.leadService.dto;

import com.stanzaliving.website.response.dto.LeadDetailEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LeadDetailListExpiryDaysMapsDto {

    List<LeadDetailEntity> leadDetailEntityList;
    Map<String, String> cityWiseLeadExpiryDaysMap;
    Map<String, String> mmWiseLeadExpiryDaysMap;
    Map<String, String> residenceWiseLeadExpiryDaysMap;
}
