package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignDashboardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignCsvDto {

    private String campaignName;

    private CampaignDashboardType campaignType;

    private String campaignDate;

    private String userId;

    private String residentName;

    private String phoneNumber;

    private String residentEmail;

    private String residenceName;

    private String microMarket;

    private String city;

    private String responseTimeStamp;

    private List<UserSurveyResponseDto> responseValue;
}
