package com.stanzaliving.core.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomMateListResponseDto {

	private String firstName;
	private String middleName;
	private String lastName;
	private String profilePic;
	private String userUuid;
}
