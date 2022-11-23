package com.stanzaliving.wanda.core.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ShiftTimingDetailsDto {
	private Integer userId;
	private String fullName;
	private String imgUrl;
	private String mobileNumber;

}
