package com.stanzaliving.core.security.policeverification.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVResponseDto {

    private String uuid;

    private String userName;

    private String userCode;

    private String imageUrl;

    private String residenceName;

    private String roomNumber;

    private String residentStatus;

    private Date movingDate;

    private String nationality;

    private String registrationType;
}
