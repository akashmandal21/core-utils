package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserDetailsAndPVStatusDto extends UserDetailsDto {

    @NotBlank(message = "PV Status is mandatory")
    @Enumerated(EnumType.STRING)
    private PoliceVerificationStatus policeVerificationStatus;

    private ArrayList<PoliceVerificationActivityDto> policeVerificationActivities;
}
