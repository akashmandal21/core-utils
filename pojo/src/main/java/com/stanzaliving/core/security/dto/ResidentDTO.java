package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.stanzaliving.core.enums.Nationality;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
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

    private String residentId;

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

    private Boolean hasBlanketApproval;

    private Boolean attendanceOptOut;

    private String floor;

    private String residentType;

    private LocalDateTime markedAt;

    private StatusCardDTO statusCard;

    private List<ResidentActivityType> residentActivities;

    private String markedBy;

    private String imageUrl;

    private PhoneType phoneType;

    private LocalDate endOfContractDate;

    private String residentCode;

    private String colorCode;

    private Double duesThreshold;
}
