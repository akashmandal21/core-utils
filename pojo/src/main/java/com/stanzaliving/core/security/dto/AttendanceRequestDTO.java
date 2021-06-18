package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.GatePassStatus;
import com.stanzaliving.core.security.enums.RequestStatus;
import com.stanzaliving.core.security.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestDTO {

    @NotNull
    @NotEmpty(message = "Resident UUID cannot be empty")
    private String residentUuid;

    private RequestType requestType;

    private LocalDate startDate;

    private LocalTime startTime;

    private LocalDate endDate;

    private LocalTime endTime;

    //TODO: replace with MealType enum
    private String nextMealType;

    private String reason;

    private String description;

    private RequestStatus requestStatus;

    private boolean hasBlanketApproval;

    private LocalDateTime approvalDate;

    private String approvedBy;

    private LocalDateTime cancellationDate;

    private String cancelledBy;

    private LocalDateTime rejectionDate;

    private String rejectedBy;

    private GatePassStatus gatePassStatus;

    // adding resident details
    private String residentName;

    private String roomNumber;

    private String residentCode;

    private String mobileNumber;

    private double dues;
}
