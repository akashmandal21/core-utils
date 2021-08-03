package com.stanzaliving.food.v2.preference.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class UserSubscriptionDto {
	private String userId;
	private String userCode;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean subscribed;
	private Double subscriptionAmount;
	private LocalDate menuDate;
}
