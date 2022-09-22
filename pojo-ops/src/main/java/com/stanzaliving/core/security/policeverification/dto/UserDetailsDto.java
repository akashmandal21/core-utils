package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.operations.enums.ResidentStatus;
import com.stanzaliving.core.security.policeverification.enums.PVApplicable;
import com.stanzaliving.core.security.policeverification.enums.RegistrationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserDetailsDto {

    @NotNull(message = "User uuid is mandatory")
    private String userUuid;

    private String userCode;

    private String imageUrl;

    private Date movingDate;

    private String bookingUuid;

    @NotNull(message = "Resident Status is mandatory")
    @Enumerated(EnumType.STRING)
    private ResidentStatus residentStatus;

    @Enumerated(EnumType.STRING)
    private RegistrationType registrationType;

    @Enumerated(EnumType.STRING)
    private PVApplicable pvApplicable;

    private UserPersonalDetailsDto userPersonalDetails;

    private StanzaResidenceDetailsDto stanzaResidenceDetails;

    private AddressDetailsDto permanentAddressDetails;

    private ParentOrGuardianDetailsDto parentOrGuardianDetails;

    private EmergencyContactDetailsDto emergencyContactDetails;

    private ProfessionalDetailsDto professionalDetails;

    private LandLordDetailsDto landlordDetails;
}
