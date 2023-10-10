package com.stanzaliving.core.security.policeverification.dto;

import com.stanzaliving.core.security.policeverification.enums.PVApplicable;
import com.stanzaliving.core.security.policeverification.enums.PVNationality;
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

    private String userUuid;

    private String imageUrl;

    private String residenceName;

    private String roomNumber;

    private String residentStatus;

    private Date movingDate;

    private PVNationality nationality;

    private String registrationType;

    private PVApplicable pvApplicable;
}
