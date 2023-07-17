package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PVNationality;
import com.stanzaliving.core.user.enums.BloodGroup;
import com.stanzaliving.core.user.enums.Gender;

import com.stanzaliving.core.user.enums.MaritalStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserPersonalDetailsDto {

    private String firstName;

    private String lastName;

    private String email;

    private Gender gender;

    @NotNull(message = "Nationality is mandatory")
    @Enumerated(EnumType.STRING)
    private PVNationality nationality;

    private String dateOfBirth;

    private BloodGroup bloodGroup;

    private MaritalStatus maritalStatus;

    private String spouseName;

    private String phoneNumber;

    private String age;

    private String caste;
}
