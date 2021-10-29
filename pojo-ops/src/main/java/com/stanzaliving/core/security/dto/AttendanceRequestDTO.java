package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.operations.enums.MealType;
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
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestDTO {

    private String uuid;

    @NotNull
    @NotEmpty(message = "Resident UUID cannot be empty")
    private String residentUuid;

    private RequestType requestType;

    private LocalDate startDate;

    private LocalTime startTime;

    private LocalDate endDate;

    private LocalTime endTime;

    private MealType nextMealType;

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

    private String residentName;

    private String roomNumber;

    private String residentCode;

    private String mobileNumber;

    private double dues;

    private Date createdAt;

    private String attendanceRequestReasonTypeUuid;

    private String qrCodeData;

    private String rejectionReason;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private String gatePassUuid;

    private Date approvalDateEpoch;

    private Date rejectionDateEpoch;

    private Date cancellationDateEpoch;

    private LocalTime mealEndTime;

    private ResidentDTO resident;
}
