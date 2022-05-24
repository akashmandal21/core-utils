package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import com.stanzaliving.core.security.policeverification.enums.TeamType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PoliceVerificationActivityDto {

    protected String id;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Team Type is mandatory")
    private TeamType teamType;

    private String comment;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Police Verification Status is mandatory")
    private PoliceVerificationStatus policeVerificationStatus;

    protected LocalDateTime createdAt;

    protected String createdBy;

    protected LocalDateTime updatedAt;

    protected String updatedBy;

}
