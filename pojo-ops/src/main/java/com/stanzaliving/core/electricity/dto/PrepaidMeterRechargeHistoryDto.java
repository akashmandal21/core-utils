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
public class PrepaidMeterRechargeHistoryDto {
	private Date rechargeDate;
	private Double rechargeAmount;
	private Double balanceAvailable;
	private Double balanceConsumed;
	private String rechargeBy;
	private String txnId;
}