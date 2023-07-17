package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.UserType;
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
public class ProfessionalDetailsDto {

    private UserType userType;

    private String educationalInstituteName;

    private String course;

    private String degree;

    private String yearOfStudy;

    private String companyName;

    private String designation;

    private String coachingCenter;
}
