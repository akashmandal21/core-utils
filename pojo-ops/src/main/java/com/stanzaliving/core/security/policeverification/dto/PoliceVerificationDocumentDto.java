package com.stanzaliving.core.security.policeverification.dto;

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
public class PoliceVerificationDocumentDto {

    private String fileS3Url;

    private String bookingUuid;

    private String residentUuid;

    private String residentCode;
}
