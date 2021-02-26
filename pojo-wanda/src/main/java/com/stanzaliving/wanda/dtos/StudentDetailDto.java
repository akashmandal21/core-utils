package com.stanzaliving.wanda.dtos;

import java.util.List;

import com.stanzaliving.wanda.response.BookingDetailResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class StudentDetailDto {
	private String studentId;
	private boolean movedIn;
	private String roomNumber;
	private String mobileNumber;
	private String userUuid;
	List<BookingDetailResponseDto> bookingDetails;
}
