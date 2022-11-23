package com.stanzaliving.core.security.dto;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.security.enums.GatePassStatus;
import com.stanzaliving.core.security.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceRequestForResidenceDTO {

    private String requestUuid;

    private String firstName;

    private String lastName;

    private String residentId;

    private String residentUuid;

    private RequestType requestType;

    private LocalDate startDate;

    private LocalTime startTime;

    private LocalDate endDate;

    private LocalTime endTime;

    private MealType nextMealType;

    private GatePassStatus gatePassStatus;

    private Double duesAmount;

    private String roomNumber;

    private BigInteger lateBy;

    private String colorCode;

    private String requestDefaulterUuid;

    private List<AttendanceDefaulterActionDTO> attendanceDefaulterActions;
}