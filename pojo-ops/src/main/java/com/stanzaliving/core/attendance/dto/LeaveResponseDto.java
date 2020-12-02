package com.stanzaliving.core.attendance.dto;

import com.stanzaliving.core.attendance.constants.LeaveMarkedBy;
import com.stanzaliving.core.attendance.constants.LeaveRequestStatus;
import com.stanzaliving.core.attendance.constants.LeaveRequestType;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveResponseDto extends AbstractDto {

	private String userId;
	private String leaveId;
	private Date fromDate;
	private Date toDate;
	private LeaveRequestType leaveRequestType;
	private LeaveRequestStatus leaveRequestStatus;
	private LeaveMarkedBy markedBy;
	private Date statusMarkedTime;

}
