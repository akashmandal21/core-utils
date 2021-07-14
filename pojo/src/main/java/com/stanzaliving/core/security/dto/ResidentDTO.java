package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentDTO {
    private Long id;

    private String uuid;

    private String firstName;

    private String lastName;

    private String residentCode;

    private Set<String> mobileNumbers;

    private Set<String> guardiansMobileNumbers;

    private Set<String> parentsMobileNumbers;

    private Nationality nationality;

    private Double duesAmount;

    private Dues dues;

    private String cityUuid;

    private String cityName;

    private String micromarketUuid;

    private String micromarketName;

    private String residenceUuid;

    private String residenceName;

    private String roomNumber;

    private Boolean blanketApproval;

    private Boolean attendanceOptOut;

    private Floor floor;

    private String residentType;

    private PhoneType phoneType;

    // TODO: Does not belong here
    private AttendanceFilter attendanceFilter;

    // TODO: Does not belong here
    private LocalDate markedTime;

    // TODO: Does not belong here
    private String colourCode;
}
