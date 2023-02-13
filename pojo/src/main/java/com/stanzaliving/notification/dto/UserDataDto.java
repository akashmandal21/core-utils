package com.stanzaliving.notification.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDto {

    private String residentName;

    private String city;

    private String microMarket;

    private String residenceName;

    private String residentEmail;

    private String phoneNumber;

    private String residenceUuid;
}
