package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import com.stanzaliving.core.security.policeverification.enums.TeamType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVFormJourneyByTeamResponseDto {

    private String title;

    private String teamType;

    private String colorCode;

    private Boolean isCompleted;

    private PoliceVerificationStatus policeVerificationStatus;

    private String policeVerificationStatusName;
    
}
