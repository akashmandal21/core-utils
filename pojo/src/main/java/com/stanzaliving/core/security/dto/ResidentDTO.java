package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.AttendanceFilter;
import com.stanzaliving.core.security.enums.Dues;
import com.stanzaliving.core.security.enums.Floor;
import com.stanzaliving.core.security.enums.Nationality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentDTO {
    private Long id;

    private String uuid;

    private String firstName;

    private String lastName;

    private String residentId;

    private List<String> mobileNumbers;

    private List<String> guardiansMobileNumbers;

    private List<String> parentsMobileNumbers;

    private Nationality nationality;

    private Double duesAmount;

    private Dues dues;

    private String cityUuid;

    private String cityName;

    private String micromarketUuid;

    private String micromarketName;

    private String residenceUuid;

    private String residenceName;

    private Integer roomNumber;

    private Boolean blanketApproval;

    private Boolean attendanceOptOut;

    private Floor floor;

    // TODO: Does not belong here
    private AttendanceFilter attendanceFilter;

    // TODO: Does not belong here
    private LocalDate markedTime;

    // TODO: Does not belong here
    private String colourCode;
}
