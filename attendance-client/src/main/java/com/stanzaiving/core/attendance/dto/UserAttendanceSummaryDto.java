package com.stanzaiving.core.attendance.dto;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class UserAttendanceSummaryDto {

	private Integer hostelId;

	@Builder.Default
	private Set<Integer> userIds = new HashSet<>();
	
	private String meal;

}
