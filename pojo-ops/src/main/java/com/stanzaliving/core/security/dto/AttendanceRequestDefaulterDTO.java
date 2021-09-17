package com.stanzaliving.core.security.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.security.enums.ActionStatus;
import com.stanzaliving.core.security.enums.GatePassStatus;
import com.stanzaliving.core.security.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestDefaulterDTO {

    private String residentUuid;

    private String attendanceRequestUuid;

    private ActionStatus actionStatus;

    private BigInteger lateBy;

    private LocalDateTime markedAt;

    private Timestamp closedAt;

    private LocalDate date;

    private RequestType requestType;

    private String firstName;

    private String lastName;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private MealType nextMealType;

    private GatePassStatus gatePassStatus;

    private boolean isResolved;

    private String residentId;

    private String roomNumber;

    private String colorCode;

    private Double duesAmount;

    private AttendanceDefaulterActionDTO action;

    private String requestDefaulterUuid;
}
