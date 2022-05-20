package com.stanzaliving.core.security.policeverification.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import com.stanzaliving.core.security.policeverification.enums.TeamType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PVFormJourneyByTeamResponseDto {

    private TeamType teamType;

    private String colorCode;

    private Boolean status;

    private PoliceVerificationStatus policeVerificationStatus;

    private String statusDescription;

    private String actionedBy;

    private String comment;

    private Date date;
}
