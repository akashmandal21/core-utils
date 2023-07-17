package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import com.stanzaliving.core.security.policeverification.enums.TeamType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class CountByTaskResponseDto {

    private TeamType teamType;

    private PoliceVerificationStatus policeVerificationStatus;

    private String policeVerificationStatusName;

    private String policeVerificationStatusColorCode;

    private Long totalPending;

}
