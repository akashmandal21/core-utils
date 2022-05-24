package com.stanzaliving.leadService.dto;

import com.stanzaliving.website.response.dto.LeadDetailEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class LeadDetailExpiryDaysMapsDto extends LeadDetailEntity {

    Map<String, String> cityWiseLeadExpiryDaysMap;
    Map<String, String> mmWiseLeadExpiryDaysMap;
    Map<String, String> residenceWiseLeadExpiryDaysMap;
}
