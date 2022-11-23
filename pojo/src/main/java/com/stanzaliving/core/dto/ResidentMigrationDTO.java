package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidentMigrationDTO {

    @JsonSetter(value = "DATE_OF_BIRTH")
    private Date residentDOB;

    @JsonSetter(value = "COUNTRY_ID")
    private Integer countryId;

    @JsonSetter(value = "PHONE")
    private String residentMobileNumber;

    @JsonSetter(value = "LAST_NAME")
    private String lastName;

    @JsonSetter(value = "FIRST_NAME")
    private String firstName;

    @JsonSetter(value = "STUDENT_ID")
    private String residentCode;

    @JsonSetter(value = "USER_UUID")
    private String residentUuId;

    @JsonSetter(value = "STUDENT_ADDRESS_ID")
    private Integer permanentAddressId;

    @JsonSetter(value = "AGREEMENT_URL")
    private String agreement;
}
