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
public class PaytmSuccessRefundWebhookDtoBody {

	private String source;

	private String txnId;

	private String orderId;

	private String txnAmount;

	private String mid;

	private String refundAmount;

	private String txnTimestamp;

	private String totalRefundAmount;

	private String acceptRefundTimestamp;

	private String refId;

	private String merchantRefundRequestTimestamp;

	private String userCreditInitiateTimestamp;

	private String refundId;

	private PaytmRefundDetailInfoList refundDetailInfoList;

	private PaytmAgentInfo agentInfo;

}
