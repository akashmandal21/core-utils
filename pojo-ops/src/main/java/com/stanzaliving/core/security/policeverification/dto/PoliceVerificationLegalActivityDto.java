package com.stanzaliving.core.security.policeverification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PoliceVerificationLegalActivityDto {

    private String userCode;

    private String reason;

    private String comment;

}
