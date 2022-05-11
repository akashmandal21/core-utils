package com.stanzaliving.core.security.dto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceSummaryResponseDto {
   
    private LocalDate attendanceDate;
    private String userCode;
    private String residenceId;

	private boolean foodScan;
	private boolean breakfastScan;
	private boolean lunchScan;
	private boolean eveiningSnackScan;
	private boolean dinnerScan;
	private boolean internetUsed;
	private String location;
	private boolean cafeFoodOrder;
	private boolean supportTicket;
	private boolean securityAttendance;

}
