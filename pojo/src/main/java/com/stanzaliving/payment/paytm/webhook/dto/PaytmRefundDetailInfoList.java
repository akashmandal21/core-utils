package com.stanzaliving.payment.paytm.webhook.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PaytmRefundDetailInfoList {

	private String userMobileNo;

	private String refundType;

	private String payMethod;

	private String refundAmount;

	private String rrn;

	private String maskedVpa;

	private String issuingBankName;

	private String maskedCardNumber;

	private String maskedBankAccountNumber;

	private String cardScheme;

	private String userCreditExpectedDate;

}