package com.stanzaliving.payment.paytm.response.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.stanzaliving.payment.paytm.dto.PaytmSourceAccountDetails;
import com.stanzaliving.payment.paytm.dto.PaytmVanInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PaytmTransactionStatusResponseDtoBody {

	private PaytmTransactionStatusResponseDtoBodyResultInfo resultInfo;

	private String txnId;

	private String bankTxnId;

	private String orderId;

	private String txnAmount;

	private String txnType;

	private String gatewayName;

	private String bankName;

	private String mid;

	private String paymentMode;

	private String refundAmt;

	private String txnDate;

	private String subsId;

	private String payableAmount;

	private String paymentPromoCheckoutData;

	private PaytmVanInfo vanInfo;

	private PaytmSourceAccountDetails sourceAccountDetails;

	private String transferMode;

	private String utr;

	private String bankTransactionDate;
}
