package com.stanzaliving.core.electricity.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PrepaidMeterCurrentBalanceDto {
	private Date date;
	private Double currentBalance;
	private String currentReading;
	private String meterId;
	private String residenceId;
	private String meterCategoryId;
	private String roomNo;
	
	private Double latestReading;
	private Double unitRate;
}