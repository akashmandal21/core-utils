package com.stanzaliving.internet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserDataHistoryUsageDto {

	private String totalDataInMb;

	private String remainingDataInMb;

	private String usedDataInMb;

	private String totalTimeInMinutes;

	private String remainingTimeInMinutes;

	private String usedTimeInMinutes;

}
