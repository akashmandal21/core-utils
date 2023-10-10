package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomMateListResponseDto {

	private String firstName;
	private String middleName;
	private String lastName;
	private String profilePic;
	private String roomNumber;
	private String userUuid;
	private String bookingUuid;
	private Date contractStartDate;
	private Date contractEndDate;
	private String contractDuration;
}
