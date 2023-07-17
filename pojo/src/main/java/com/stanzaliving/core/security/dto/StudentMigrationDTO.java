package com.stanzaliving.core.security.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentMigrationDTO {
    @JsonSetter(value = "FIRST_NAME")
    private String firstName;

    @JsonSetter(value = "LAST_NAME")
    private String lastName;

    @JsonSetter(value = "STUDENT_ID")
    private String residentId;

    @JsonSetter(value = "UUID")
    private String residentUuid;

    @JsonSetter(value = "PHONE")
    private String phone;

    @JsonSetter(value = "COUNTRY_ID")
    private Integer countryId;

    @JsonSetter(value = "STUDENT_ADDRESS_ID")
    private Integer addressId;

    @JsonSetter(value = "IMAGE")
    private String image;

    @JsonSetter(value = "GENDER")
    private Integer gender;

}

