package com.stanzaliving.core.attendance.dto;


import com.stanzaliving.core.attendance.constants.LeaveRequestType;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveDto extends AbstractDto {
	private String userId;
	private String residenceId;
	private Date fromDate;
	private Date toDate;
	private LeaveRequestType leaveRequestType;
	private String comment;

}
