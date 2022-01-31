package com.stanzaliving.core.electricity.dto;


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
public class PrepaidMeterRechargeDetailsDto {

	private Double currentBalance;
	private Double latestReading;
	private Double unitRate;
	private Double amountAfterLastRecharge;
	
	private PrepaidMeterRechargeHistoryDto prepaidMeterLastRechargeDto;
	
}