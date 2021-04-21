package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsDto {

    private String userId;

    private String residentName;

    private String phoneNumber;

    private String residentEmail;

    private String residenceName;

    private String microMarket;

    private String city;
}

