package com.stanzaliving.core.security.policeverification.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class LandLordDetailsDto {

    private String name;

    private String fatherName;

    private String phoneNumber;

    private AddressDetailsDto addressInfo;

}
