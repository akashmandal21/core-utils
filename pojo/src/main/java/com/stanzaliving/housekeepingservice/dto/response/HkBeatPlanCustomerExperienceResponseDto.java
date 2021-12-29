package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

import java.util.List;

/**
 * @author Anudeep Alevoor
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPlanCustomerExperienceResponseDto {

    private String residenceUuid;

    private String residenceName;

    private HkBeatResidenceInfoResponseDto residenceInfo;

    private List<HkBeatVendorResponseDto> vendors;

    private List<HkBeatResidenceIssuesReportedResponseDto> issues;
}
