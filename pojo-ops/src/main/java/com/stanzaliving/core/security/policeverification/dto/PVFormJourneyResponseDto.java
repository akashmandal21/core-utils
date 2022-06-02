package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVFormJourneyResponseDto {

    private PoliceVerificationStatus policeVerificationCurrentStatus;

    private String policeVerificationCurrentStatusName;

    private String policeVerificationCurrentStatusColorCode;

    private PoliceVerificationStatus policeVerificationPrevStatus;

    private String policeVerificationPrevStatusName;

    private PoliceVerificationStatus policeVerificationNextStatus;

    private String policeVerificationNextStatusName;

    private List<PVFormJourneyByTeamResponseDto> formJourney;
}
