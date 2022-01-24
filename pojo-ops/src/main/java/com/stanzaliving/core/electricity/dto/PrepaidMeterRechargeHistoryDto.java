package com.stanzaliving.core.electricity.dto;


import java.io.Serializable;
import java.util.Date;

import com.stanzaliving.core.payment.enums.PaymentMode;

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
public class PrepaidMeterRechargeHistoryDto implements Serializable {

	private static final long serialVersionUID = 5409980353936704825L;
	private Date rechargeDate;
	private Double rechargeAmount;
	private Double amountAvailableAtRecharge;
	private Double amountAvailableAfterRecharge;
	private Double readingAtRecharge;
	private String rechargeBy;
	private String txnId;
	private String meterId;
	private PaymentMode paymentMode;
	private String userId;
	private String residenceId;
}