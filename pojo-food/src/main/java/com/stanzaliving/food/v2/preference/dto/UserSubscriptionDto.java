package com.stanzaliving.food.v2.preference.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
	private Double expectedSubscriptionAmount;
	private String bannerMessage;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate menuDate;
	private Boolean foodOrderWindowCloseStatus;
}
