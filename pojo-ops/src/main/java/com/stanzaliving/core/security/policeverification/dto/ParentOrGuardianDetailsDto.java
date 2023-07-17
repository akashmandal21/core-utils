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
public class ParentOrGuardianDetailsDto {

    private String relationWithGuardian;

    private String guardianName;

    private String fatherName;

    private String motherName;

    private String phoneNumber;

    private String email;

}
