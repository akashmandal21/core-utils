package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PoliceVerificationStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserDetailsAndPVStatusDto extends UserDetailsDto {

    private String id;

    private String uuid;

    @NotNull(message = "PV Status is mandatory")
    @Enumerated(EnumType.STRING)
    private PoliceVerificationStatus policeVerificationStatus;

    private ArrayList<PoliceVerificationActivityDto> policeVerificationActivities;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private boolean status = true;

}
