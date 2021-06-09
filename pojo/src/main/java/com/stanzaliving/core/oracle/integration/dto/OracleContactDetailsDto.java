package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OracleContactDetailsDto {

    @JsonProperty("contactid")
    private String contactid;  //set

    @JsonProperty("firstname")
    private String firstname;  //set

    @JsonProperty("middlename")
    private String middlename;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("phone")
    private String phone;  //set

    @JsonProperty("email")
    private String email;  //set

    @JsonProperty("designation")
    private String designation;  //set

}
