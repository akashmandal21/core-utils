package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.operations.enums.ResidentStatus;
import com.stanzaliving.core.security.policeverification.enums.RegistrationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserDetailsDto {

    private String userUuid;

    private String userCode;

    private String imageUrl;

    private LocalDateTime movingDate;

    @NotNull(message = "Resident Status is mandatory")
    @Enumerated(EnumType.STRING)
    private ResidentStatus residentStatus;

    @NotBlank(message = "Registration Type is mandatory")
    @Enumerated(EnumType.STRING)
    private RegistrationType registrationType;

    private UserPersonalDetailsDto userPersonalDetails;

    private StanzaResidenceDetailsDto stanzaResidenceDetailsDto;

    private AddressDetailsDto permanentAddressDetails;

    private ParentOrGuardianDetailsDto parentOrGuardianDetails;

    private EmergencyContactDetailsDto emergencyContactDetails;

    private ProfessionalDetailsDto professionalDetails;

    private LandLordDetailsDto landlordDetails;
}
