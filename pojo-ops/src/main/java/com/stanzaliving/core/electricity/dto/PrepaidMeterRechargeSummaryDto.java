package com.stanzaliving.core.electricity.dto;


import java.io.Serializable;
import java.util.List;

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
public class PrepaidMeterRechargeSummaryDto implements Serializable {

	private static final long serialVersionUID = 2652332741318486345L;
	private Double totalRecharge;
	private Double totalConsumed;
	private Double balanceAvailable;
	
	List<PrepaidMeterRechargeHistoryDto> prepaidMeterRechargeHistoryDto;
	
}