package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.core.residenceservice.enums.ResidentType;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentProfessionalDetailsDto {
    @NotBlank(message = "User Id is Required")
    private String userId;

    @NotBlank(message = "Resident Type is Required")
    private ResidentType residentType;

    private String educationalInstitute;
    private String educationalInstituteName;
    private String course;
    private String courseName;
    private String degree;
    private String degreeName;
    private Integer yearOfStudy;

    private String companyName;

    private String designation;

    private String profilePic;
}
