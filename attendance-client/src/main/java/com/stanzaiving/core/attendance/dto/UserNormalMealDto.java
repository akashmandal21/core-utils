package com.stanzaiving.core.attendance.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class UserNormalMealDto {

	private String userId;
	private String orderId;
	private String foodItemType;
	private String meal;
	private boolean optional;
}