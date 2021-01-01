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
public class PaytmAcceptRefundWebhookDtoBody {

	private String txnTimestamp;

	private String orderId;

	private String refundAmount;

	private String refundId;

	private String txnAmount;

	private String txnId;

	private String merchantRefundRequestTimestamp;

	private String acceptRefundTimestamp;

	private String refId;

	private String refundReason;
	
	private PaytmAgentInfo agentInfo;
	
	private String status;

	private String rejectRefundReasonCode;

	private String rejectRefundReasonMessage;

}
